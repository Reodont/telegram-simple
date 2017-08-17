/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model.com.reodont.telegram.model.object;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class CallbackQuery implements Serializable {

    private static final long serialVersionUID = -5860887247179163244L;

    private String id;

    private User from;

    private Message message;

    @SerializedName("inline_message_id")
    private String inlineMessageId;

    @SerializedName("chat_instance")
    private String chatInstance;

    private String data;

    @SerializedName("game_short_name")
    private String gameShortName;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public Message getMessage() {
        return message;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public String getData() {
        return data;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallbackQuery that = (CallbackQuery) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (inlineMessageId != null ? !inlineMessageId.equals(that.inlineMessageId) : that.inlineMessageId != null)
            return false;
        if (chatInstance != null ? !chatInstance.equals(that.chatInstance) : that.chatInstance != null) return false;
        if (data != null ? !data.equals(that.data) : that.data != null) return false;
        return gameShortName != null ? gameShortName.equals(that.gameShortName) : that.gameShortName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (inlineMessageId != null ? inlineMessageId.hashCode() : 0);
        result = 31 * result + (chatInstance != null ? chatInstance.hashCode() : 0);
        result = 31 * result + (data != null ? data.hashCode() : 0);
        result = 31 * result + (gameShortName != null ? gameShortName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CallbackQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", message=" + message +
                ", inlineMessageId='" + inlineMessageId + '\'' +
                ", chatInstance='" + chatInstance + '\'' +
                ", data='" + data + '\'' +
                ", gameShortName='" + gameShortName + '\'' +
                '}';
    }
}
