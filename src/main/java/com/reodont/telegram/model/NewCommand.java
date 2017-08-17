/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.google.gson.annotations.SerializedName;
import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Chat;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Message;
import com.reodont.telegram.model.com.reodont.telegram.model.object.User;

public class NewCommand extends Event {

    private static final long serialVersionUID = 7141738868749667102L;

    @SerializedName("message_id")
    private Integer messageId;

    private User from;

    private Integer date;

    private Chat chat;

    @SerializedName("forward_from")
    private User forwardFrom;

    @SerializedName("forward_from_chat")
    private Chat forwardFromChat;

    @SerializedName("forward_from_message_id")
    private Integer forwardFromMessageId;

    @SerializedName("forward_date")
    private Integer forwardDate;

    @SerializedName("reply_to_message")
    private Message replyToMessage;

    @SerializedName("edit_date")
    private Integer editDate;

    private String text;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public User getFrom() {
        return from;
    }

    public Integer getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public Integer getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public Integer getForwardDate() {
        return forwardDate;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewCommand that = (NewCommand) o;

        if (messageId != null ? !messageId.equals(that.messageId) : that.messageId != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (chat != null ? !chat.equals(that.chat) : that.chat != null) return false;
        if (forwardFrom != null ? !forwardFrom.equals(that.forwardFrom) : that.forwardFrom != null) return false;
        if (forwardFromChat != null ? !forwardFromChat.equals(that.forwardFromChat) : that.forwardFromChat != null)
            return false;
        if (forwardFromMessageId != null ? !forwardFromMessageId.equals(that.forwardFromMessageId) : that.forwardFromMessageId != null)
            return false;
        if (forwardDate != null ? !forwardDate.equals(that.forwardDate) : that.forwardDate != null) return false;
        if (replyToMessage != null ? !replyToMessage.equals(that.replyToMessage) : that.replyToMessage != null)
            return false;
        if (editDate != null ? !editDate.equals(that.editDate) : that.editDate != null) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = messageId != null ? messageId.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (chat != null ? chat.hashCode() : 0);
        result = 31 * result + (forwardFrom != null ? forwardFrom.hashCode() : 0);
        result = 31 * result + (forwardFromChat != null ? forwardFromChat.hashCode() : 0);
        result = 31 * result + (forwardFromMessageId != null ? forwardFromMessageId.hashCode() : 0);
        result = 31 * result + (forwardDate != null ? forwardDate.hashCode() : 0);
        result = 31 * result + (replyToMessage != null ? replyToMessage.hashCode() : 0);
        result = 31 * result + (editDate != null ? editDate.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NewCommand{" +
                "messageId=" + messageId +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forwardFrom=" + forwardFrom +
                ", forwardFromChat=" + forwardFromChat +
                ", forwardFromMessageId=" + forwardFromMessageId +
                ", forwardDate=" + forwardDate +
                ", replyToMessage=" + replyToMessage +
                ", editDate=" + editDate +
                ", text='" + text + '\'' +
                '}';
    }
}
