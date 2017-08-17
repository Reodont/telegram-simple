/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Message;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Update;
import com.reodont.telegram.util.ResourceUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Request {

    private final String token;

    public Request() throws IOException {
        Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
        token = properties.getProperty("telegram.token");
    }

    private String makeRequest(String urlRequest, String... prm) throws IOException {
        URL url = new URL(urlRequest + ((prm.length > 0) ? prm[0] : ""));
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod((prm.length > 0) ? "POST" : "GET");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return content.toString();
    }

    public List<Update> getUpdates() throws IOException {


        Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
        Integer offset = Integer.valueOf(properties.getProperty("telegram.offset"));

        String content = makeRequest("https://api.telegram.org/bot" + token + "/getUpdates?offset=" + offset.toString());

        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(content.toString()).getAsJsonObject();
        JsonElement projectElement = rootObject.get("result");

        List<Update> updateList = new Gson().fromJson(projectElement, new TypeToken<ArrayList<Update>>() {
        }.getType());

        if (!updateList.isEmpty()) {
            OutputStream out = null;
            File f = new File("src/main/resources/token.properties");

            properties.load(new FileReader(f));
            properties.setProperty("telegram.offset", "" + (updateList.get(updateList.size() - 1).getUpdateId() + 1));

            out = new FileOutputStream(f);
            properties.store(out, "Offset change");
        }
        return updateList;
    }

    public Message sendMessage(Message message) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token + "/sendMessage", "?chat_id=" + message.getChat().getId() + "&text=" + URLEncoder.encode(message.getText(), "UTF-8"));

        return (Message) new Gson().fromJson(content, Message.class);

    }
}
