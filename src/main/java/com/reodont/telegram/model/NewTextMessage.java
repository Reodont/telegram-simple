/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Message;

public class NewTextMessage extends Event {

    private static final long serialVersionUID = -789398750532953751L;

    private Message message;

    public NewTextMessage() {
    }

    public NewTextMessage(Message message) {
        this.message = message;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Message getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewTextMessage that = (NewTextMessage) o;

        return message != null ? message.equals(that.message) : that.message == null;
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "NewTextMessage{" +
                "message=" + message +
                '}';
    }
}
