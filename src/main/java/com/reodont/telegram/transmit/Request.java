/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.reodont.telegram.model.Message;
import com.reodont.telegram.model.Update;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Request {
    public String makeRequest(String urlRequest, String... prm) throws IOException {
        URL url = new URL(urlRequest);
        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
        con.setRequestMethod((prm.length > 1) ? "GET" : "POST");

        if (prm.length > 1) {
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(prm[0]);
            wr.flush();
            wr.close();

            int responceCode = con.getResponseCode();
            System.out.println("Responce code is: " + responceCode);
        }

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

    public List<Update> getUpdates(String token) throws IOException {

        String content = makeRequest("https://api.telegram.org/bot" + token + "/getUpdates");

        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(content.toString()).getAsJsonObject();
        JsonElement projectElement = rootObject.get("result");

        List<Update> updateList = new Gson().fromJson(projectElement, new TypeToken<ArrayList<Update>>() {
        }.getType());

        return updateList;
    }

    public Message sendMessage(Message message, String token) throws IOException {
        String messageParameters = "chat_id=" + message.getChat().getId().toString() + "&text=" + message.getText();
        String content = makeRequest("https://api.telegram.org/bot" + token + "/sendMessage", messageParameters);
        return (Message) new Gson().fromJson(content, Message.class);

    }
}
