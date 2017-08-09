/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.eip.Event;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
    //store all messages received by the subscriber
    private List<Event> subscriberEvents = new ArrayList<>();

    public List<Event> getSubscriberEvents() {
        return subscriberEvents;
    }

    public void setSubscriberEvents(List<Event> subscriberEvents) {
        this.subscriberEvents = subscriberEvents;
    }

    public abstract void addSubscriber(Event event, PubSubService pubSubService);

    public abstract void unSubscribe(Event event, PubSubService pubSubService);

    public abstract void getEventsForSubscriberOfTopic(Event event, PubSubService pubSubService);

}