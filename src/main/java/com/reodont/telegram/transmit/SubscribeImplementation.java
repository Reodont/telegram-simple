/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;


import com.reodont.telegram.eip.Event;


public class SubscribeImplementation extends Subscriber {
    //Add subscriber with PubSubService for a topic
    public void addSubscriber(Event event, PubSubService pubSubService) {
        pubSubService.addSubscriber(event, this);
    }

    //Unsubscribe subscriber with PubSubService for a topic
    public void unSubscribe(Event event, PubSubService pubSubService) {
        pubSubService.removeSubscriber(event, this);
    }

    //Request specifically for messages related to topic from PubSubService
    public void getEventsForSubscriberOfTopic(Event event, PubSubService pubSubService) {
        pubSubService.getMessagesForSubscriberOfTopic(event, this);

    }

    public void print() {

    }
}