/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.transmit.*;
import com.reodont.telegram.util.ResourceUtils;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Bot {
    Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
    public final String token = properties.getProperty("telegram.token");

    public Bot() throws IOException {
    }

    public void longPolling(String token) throws IOException {
        Request request = new Request();
        List<Update> updates = request.getUpdates(token);
        Publisher publisher = new PublisherImplementation();
        PubSubService pubSubService = new PubSubService();

        for (Update update : updates) {
            if (update.message().text() != null && update.message().text().startsWith("/")) {
                publisher.publish(new NewCommand(update.message()), pubSubService);
                System.out.println("READ THAT");
            } else if (update.message().audio() != null)
                publisher.publish(new NewAudio(update.message()), pubSubService);
            else if (update.message().text() != null)
                publisher.publish(new NewTextMessage(update.message()), pubSubService);
            else System.out.println("Unhandled Event!");
        }


        Subscriber test = new SubscribeImplementation();
        test.addSubscriber(new NewTextMessage(), pubSubService);
        test.addSubscriber(new NewAudio(), pubSubService);
        test.addSubscriber(new NewCommand(), pubSubService);

        pubSubService.broadcast();

        for (Event event : test.getSubscriberEvents()) {
            System.out.println(event);
        }


    }
}
