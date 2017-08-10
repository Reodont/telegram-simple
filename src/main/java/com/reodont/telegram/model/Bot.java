/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.model;

import com.reodont.telegram.transmit.PubSubService;
import com.reodont.telegram.transmit.Publisher;
import com.reodont.telegram.transmit.PublisherImplementation;
import com.reodont.telegram.transmit.Request;
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
        /*
        for (Update update : updates) {
            if (update.getMessage().getText() != null && update.getMessage().getText().startsWith("/")) {
                publisher.publish(new NewCommand(update.getMessage()), pubSubService);
                System.out.println("READ THAT");
            } else if (update.getMessage().getAudio() != null)
                publisher.publish(new NewAudio(update.getMessage()), pubSubService);
            else if (update.getMessage().getText() != null)
                publisher.publish(new NewTextMessage(update.getMessage()), pubSubService);
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
        */

    }
}
