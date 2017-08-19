/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.subcriber;

import com.reodont.telegram.model.NewTextMessage;
import com.reodont.telegram.model.com.reodont.telegram.model.object.Message;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.transmit.Subscriber;

import java.io.IOException;


public class MessageSubscriber extends Subscriber {
    public void onEvent(Object o) {
        replyMessage((NewTextMessage) o);
    }

    public void replyMessage(NewTextMessage event) {
        try {
            Request request = new Request();
            request.sendVideo(new Message(event), "http://techslides.com/demos/sample-videos/small.mp4");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
