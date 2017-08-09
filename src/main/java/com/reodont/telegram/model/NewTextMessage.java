/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.eip.Event;

public class NewTextMessage extends Event {
    private Integer message_id;
    private User from;
    private Integer date;
    private Chat chat;
    private User forward_from;
    private Chat forward_from_chat;
    private Integer forward_from_message_id;
    private Integer forward_date;
    private Message reply_to_message;
    private Integer edit_date;
    private String text;

    public Integer getMessage_id() {
        return message_id;
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

    public User getForward_from() {
        return forward_from;
    }

    public Chat getForward_from_chat() {
        return forward_from_chat;
    }

    public Integer getForward_from_message_id() {
        return forward_from_message_id;
    }

    public Integer getForward_date() {
        return forward_date;
    }

    public Message getReply_to_message() {
        return reply_to_message;
    }

    public Integer getEdit_date() {
        return edit_date;
    }

    public String getText() {
        return text;
    }

    public NewTextMessage(Integer message_id) {
        this.message_id = message_id;
    }

    public NewTextMessage() {
    }

    public NewTextMessage(Message message) {
        this.chat = message.chat();
        this.date = message.date();
        this.edit_date = message.editDate();
        this.from = message.from();
        this.forward_from = message.forwardFrom();
        this.forward_date = message.forwardDate();
        this.forward_from_chat = message.forwardFromChat();
        this.forward_from_message_id = message.forwardFromMessageId();
        this.reply_to_message = message.replyToMessage();
        this.text = message.text();
        this.message_id = message.messageId();
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "message_id=" + message_id +
                ", from=" + from +
                ", date=" + date +
                ", chat=" + chat +
                ", forward_from=" + forward_from +
                ", forward_from_chat=" + forward_from_chat +
                ", forward_from_message_id=" + forward_from_message_id +
                ", forward_date=" + forward_date +
                ", reply_to_message=" + reply_to_message +
                ", edit_date=" + edit_date +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewTextMessage that = (NewTextMessage) o;

        if (message_id != null ? !message_id.equals(that.message_id) : that.message_id != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (chat != null ? !chat.equals(that.chat) : that.chat != null) return false;
        if (forward_from != null ? !forward_from.equals(that.forward_from) : that.forward_from != null) return false;
        if (forward_from_chat != null ? !forward_from_chat.equals(that.forward_from_chat) : that.forward_from_chat != null)
            return false;
        if (forward_from_message_id != null ? !forward_from_message_id.equals(that.forward_from_message_id) : that.forward_from_message_id != null)
            return false;
        if (forward_date != null ? !forward_date.equals(that.forward_date) : that.forward_date != null) return false;
        if (reply_to_message != null ? !reply_to_message.equals(that.reply_to_message) : that.reply_to_message != null)
            return false;
        if (edit_date != null ? !edit_date.equals(that.edit_date) : that.edit_date != null) return false;
        return text != null ? text.equals(that.text) : that.text == null;
    }

    @Override
    public int hashCode() {
        int result = message_id != null ? message_id.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (chat != null ? chat.hashCode() : 0);
        result = 31 * result + (forward_from != null ? forward_from.hashCode() : 0);
        result = 31 * result + (forward_from_chat != null ? forward_from_chat.hashCode() : 0);
        result = 31 * result + (forward_from_message_id != null ? forward_from_message_id.hashCode() : 0);
        result = 31 * result + (forward_date != null ? forward_date.hashCode() : 0);
        result = 31 * result + (reply_to_message != null ? reply_to_message.hashCode() : 0);
        result = 31 * result + (edit_date != null ? edit_date.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }
}
