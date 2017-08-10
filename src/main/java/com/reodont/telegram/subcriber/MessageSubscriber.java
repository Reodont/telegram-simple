/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.subcriber;

import com.reodont.telegram.model.Message;
import com.reodont.telegram.model.NewTextMessage;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.transmit.Subscriber;
import com.reodont.telegram.util.ResourceUtils;

import java.io.IOException;
import java.util.Properties;


public class MessageSubscriber extends Subscriber {
    public void onEvent(Object o) {
        System.out.println(o.toString());
        replyMessage((NewTextMessage) o);
    }

    public void replyMessage(NewTextMessage event) {
        try {
            Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
            final String token = properties.getProperty("telegram.token");
            Request request = new Request();
            request.sendMessage(new Message(event), token);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
