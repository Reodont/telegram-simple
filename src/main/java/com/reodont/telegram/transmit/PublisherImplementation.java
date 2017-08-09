/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.eip.Event;

public class PublisherImplementation implements Publisher {
    public void publish(Event event, PubSubService pubSubService) {
        pubSubService.addEventToQueue(event);
    }
}