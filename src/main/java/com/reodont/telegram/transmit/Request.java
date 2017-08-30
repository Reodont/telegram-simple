/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.reodont.telegram.model.object.*;
import com.reodont.telegram.util.ResourceUtils;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.io.File;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@SuppressWarnings("unchecked")
public class Request {

    private final String token;


    public Request() throws IOException {
        Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
        token = properties.getProperty("token");
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
        Integer offset = Integer.valueOf(properties.getProperty("offset"));

        String content = makeRequest("https://api.telegram.org/bot" + token + "/getUpdates?offset=" + offset.toString());

        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(content.toString()).getAsJsonObject();
        JsonElement projectElement = rootObject.get("result");

        List<Update> updateList = new Gson().fromJson(projectElement, new TypeToken<ArrayList<Update>>() {
        }.getType());

        if (!updateList.isEmpty()) {
            OutputStream out;
            File f = new File(this.getClass().getResource("/token.properties").getFile());

            properties.load(new FileReader(f));
            properties.setProperty("offset", "" + (updateList.get(updateList.size() - 1).getUpdateId() + 1));

            out = new FileOutputStream(f);
            properties.store(out, "Offset change");
        }
        return updateList;
    }

    public Message sendMessage(Message message) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendMessage", "?chat_id=" + message.getChat().getId()
                + "&text=" + URLEncoder.encode(message.getText(), "UTF-8"));

        return new Gson().fromJson(content, Message.class);

    }

    public void getMe() throws IOException {
        makeRequest("https://api.telegram.org/bot" + token + "/getMe");
    }

    public Message forwardMessage(Message message, Chat destinationChat) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/forwardMessage", "?chat_id=" + destinationChat.getId() +
                "&from_chat_id=" + message.getChat().getId() +
                "&text=" + URLEncoder.encode(message.getText(), "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendPhoto(Message message, String photoUrl) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendPhoto", "?chat_id=" + message.getChat().getId()
                + "&photo=" + URLEncoder.encode(photoUrl, "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendAudio(Message message, String audioURL) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendAudio", "?chat_id=" + message.getChat().getId()
                + "&audio=" + URLEncoder.encode(audioURL, "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendDocument(Message message) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendDocument", "?chat_id=" + message.getChat().getId()
                + "&document=" + URLEncoder.encode(message.getText(), "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendVideo(Message message, String videoURL) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendVideo", "?chat_id=" + message.getChat().getId()
                + "&video=" + URLEncoder.encode(videoURL, "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendVoice(Message message) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendVoice", "?chat_id=" + message.getChat().getId()
                + "&voice=" + URLEncoder.encode(message.getText(), "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendContact(Message message, Contact contact) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendContact", "?chat_id=" + message.getChat().getId()
                + "&phone_number=" + contact.getPhoneNumber()
                + "&first_name=" + URLEncoder.encode(contact.getFirstName(), "UTF-8")
                + "&last_name=" + URLEncoder.encode(contact.getLastName(), "UTF-8"));

        return new Gson().fromJson(content, Message.class);
    }

    public Message sendChatAction(Message message, String action) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/sendChatAction", "?chat_id=" + message.getChat().getId()
                + "&action=" + action);

        return new Gson().fromJson(content, Message.class);
    }

    public UserProfilePhotos getUserProfilePhotos(User user) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/getUserProfilePhotos", "?user_id=" + user.getId());

        return new Gson().fromJson(content, UserProfilePhotos.class);
    }

    public File getFile(String fileId, String filePath) throws IOException {
        String content = makeRequest("https://api.telegram.org/file/bot" + token + "/" + filePath, "?file_id=" + fileId);

        return new Gson().fromJson(content, File.class);
    }

    public void kickChatMember(Chat chat, User user, Integer untilDate) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/kickChatMember", "?user_id=" + user.getId()
                + "&chat_id=" + chat.getId()
                + "&until_date=" + untilDate);
    }

    public void unbanChatMember(Chat chat, User user) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/unbanChatMember", "?user_id=" + user.getId()
                + "&chat_id=" + chat.getId());
    }

    public void restrictChatMember(Chat chat, User user, Integer untilDate) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/restrictChatMember", "?user_id=" + user.getId()
                + "&chat_id=" + chat.getId()
                + "&until_date=" + untilDate);
    }

    public void promoteChatMember(Chat chat, User user) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/promoteChatMember", "?user_id=" + user.getId()
                + "&chat_id=" + chat.getId());
    }

    public void exportChatInviteLink(Chat chat, User user) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/exportChatInviteLink", "?chat_id=" + chat.getId());
    }

    public void setChatPhoto(Chat chat, File file) throws IOException {

    }

    public void deleteChatPhoto(Chat chat) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/deleteChatPhoto", "?chat_id=" + chat.getId());
    }

    public void setChatTitle(Chat chat, String title) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/setChatTitle", "?chat_id=" + chat.getId()
                + "&title=" + title);
    }

    public void setChatDescription(Chat chat, String desc) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/setChatDescription", "?chat_id=" + chat.getId()
                + "&description=" + desc);
    }

    public void pinChatMessage(Chat chat, Message message) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/pinChatMessage", "?chat_id=" + chat.getId()
                + "&message_id=" + message.getMessageId());
    }

    public void unpinChatMessage(Chat chat) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/unpinChatMessage", "?chat_id=" + chat.getId());
    }

    public void leaveChat(Chat chat) throws IOException {
        makeRequest("https://api.telegram.org/bot" + token
                + "/leaveChat", "?chat_id=" + chat.getId());
    }

    public Chat getChat(Integer chatId) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/getChat", "?chat_id=" + chatId);

        return new Gson().fromJson(content, Chat.class);
    }

    public List<ChatMember> getChatAdministrators(Integer chatId) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/getChatAdministrators", "?chat_id=" + chatId);

        JsonParser parser = new JsonParser();
        JsonObject rootObject = parser.parse(content.toString()).getAsJsonObject();
        JsonElement projectElement = rootObject.get("result");

        List<ChatMember> updateList = new Gson().fromJson(projectElement, new TypeToken<ArrayList<ChatMember>>() {
        }.getType());

        return updateList;
    }

    public Integer getChatMembersCount(Chat chat) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/getChatMembersCount", "?chat_id=" + chat.getId());

        return new Gson().fromJson(content, Integer.class);
    }

    public ChatMember getChatMember(Chat chat, User user) throws IOException {
        String content = makeRequest("https://api.telegram.org/bot" + token
                + "/getChatMember", "?chat_id=" + chat.getId()
                + "&user_id=" + user.getId());

        return new Gson().fromJson(content, ChatMember.class);
    }

}
