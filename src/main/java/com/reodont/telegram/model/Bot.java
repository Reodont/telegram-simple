/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.util.ResourceUtils;

import java.io.IOException;
import java.util.Properties;

public class Bot {

    Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
    public final String token = properties.getProperty("telegram.token");

    public Bot() throws IOException {
    }

        /*public void longPolling() throws IOException {

            Request request = new Request();
            List<Update> updates = request.getUpdates();
            Publisher publisher = new Publisher();
            Subscriber messageSubscriber = new MessageSubscriber();

            publisher.addSubscriber(new NewTextMessage(), messageSubscriber);
            publisher.addSubscriber(new NewCommand(), commandSubscriber);

            for (Update update : updates) {
                if (update.getMessage() != null)
                    if (!update.getMessage().getText().startsWith("/"))
                        publisher.publish(new NewTextMessage(update.getMessage()));
                    else publisher.publish(new NewCommand(update.getMessage()));
            }

            publisher.broadcast();

        }*/
}

