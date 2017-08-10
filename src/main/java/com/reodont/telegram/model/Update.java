/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Update implements Serializable {

    private static final long serialVersionUID = 6754827162861790992L;

    @SerializedName("update_id")
    private Integer updateId;

    private Message message;

    @SerializedName("edited_message")
    private Message editedMessage;

    @SerializedName("channel_post")
    private Message channelPost;

    @SerializedName("edited_channel_post")
    private Message editedChannelPost;

    @SerializedName("inline_query")
    private InlineQuery inlineQuery;

    @SerializedName("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;

    @SerializedName("callback_query")
    private CallbackQuery callbackQuery;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Update update = (Update) o;

        if (updateId != null ? !updateId.equals(update.updateId) : update.updateId != null) return false;
        if (message != null ? !message.equals(update.message) : update.message != null) return false;
        if (editedMessage != null ? !editedMessage.equals(update.editedMessage) : update.editedMessage != null)
            return false;
        if (channelPost != null ? !channelPost.equals(update.channelPost) : update.channelPost != null) return false;
        if (editedChannelPost != null ? !editedChannelPost.equals(update.editedChannelPost) : update.editedChannelPost != null)
            return false;
        if (inlineQuery != null ? !inlineQuery.equals(update.inlineQuery) : update.inlineQuery != null) return false;
        if (chosenInlineResult != null ? !chosenInlineResult.equals(update.chosenInlineResult) : update.chosenInlineResult != null)
            return false;
        return callbackQuery != null ? callbackQuery.equals(update.callbackQuery) : update.callbackQuery == null;
    }

    @Override
    public int hashCode() {
        int result = updateId != null ? updateId.hashCode() : 0;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (editedMessage != null ? editedMessage.hashCode() : 0);
        result = 31 * result + (channelPost != null ? channelPost.hashCode() : 0);
        result = 31 * result + (editedChannelPost != null ? editedChannelPost.hashCode() : 0);
        result = 31 * result + (inlineQuery != null ? inlineQuery.hashCode() : 0);
        result = 31 * result + (chosenInlineResult != null ? chosenInlineResult.hashCode() : 0);
        result = 31 * result + (callbackQuery != null ? callbackQuery.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Update{" +
                "updateId=" + updateId +
                ", message=" + message +
                ", editedMessage=" + editedMessage +
                ", channelPost=" + channelPost +
                ", editedChannelPost=" + editedChannelPost +
                ", inlineQuery=" + inlineQuery +
                ", chosenInlineResult=" + chosenInlineResult +
                ", callbackQuery=" + callbackQuery +
                '}';
    }
}
