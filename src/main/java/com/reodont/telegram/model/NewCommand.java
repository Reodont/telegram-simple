/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.object.Message;

import java.io.IOException;

public class NewCommand extends Event {

    private static final long serialVersionUID = 7141738868749667102L;

    private Message message;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public Message getMessage() {
        return message;
    }

    public NewCommand() throws IOException {
    }

    public NewCommand(Message message) throws IOException {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NewCommand{" +
                "message=" + message +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewCommand that = (NewCommand) o;

        return message != null ? message.equals(that.message) : that.message == null;
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }
}
