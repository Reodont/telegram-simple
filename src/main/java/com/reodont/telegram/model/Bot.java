/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.model.com.reodont.telegram.model.object.Update;
import com.reodont.telegram.subcriber.MessageSubscriber;
import com.reodont.telegram.transmit.Publisher;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.transmit.Subscriber;
import com.reodont.telegram.util.ResourceUtils;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Bot {
    Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
    public final String token = properties.getProperty("telegram.token");

    public Bot() throws IOException {
    }

    public void longPolling() throws IOException {
        Request request = new Request();
        List<Update> updates = request.getUpdates();
        Publisher publisher = new Publisher();
        Subscriber messageSubscriber = new MessageSubscriber();

        publisher.addSubscriber(new NewTextMessage(), messageSubscriber);

        for (Update update : updates) {
            if (update.getMessage() != null)
                publisher.publish(new NewTextMessage(update.getMessage()));
        }

        publisher.broadcast();

    }
}
