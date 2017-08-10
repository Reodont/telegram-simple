/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.eip.Event;

import java.util.*;

public class Publisher {

    private Map<Class<? extends Event>, ArrayList<Subscriber>> subscribersTopicMap = new HashMap<>();

    private Queue<Event> eventsQueue = new LinkedList<>();

    public void publish(Event event) {
        eventsQueue.add(event);
    }

    public void addSubscriber(Event event, Subscriber subscriber) {

        ArrayList<Subscriber> subscribers = subscribersTopicMap.get(event.getClass());

        if (subscribers != null) {
            subscribers.add(subscriber);
            subscribersTopicMap.put(event.getClass(), subscribers);
        } else {
            subscribers = new ArrayList<>();
            subscribers.add(subscriber);
            subscribersTopicMap.put(event.getClass(), subscribers);
        }
    }

    public void broadcast() {
        if (eventsQueue.isEmpty()) {
            System.out.println("No messages to display");
        } else {
            while (!eventsQueue.isEmpty()) {
                Event event = eventsQueue.remove();

                List<Subscriber> subscribersOfTopic = subscribersTopicMap.get(event.getClass());

                for (Subscriber subscriber : subscribersOfTopic) {
                    subscriber.onEvent(event);
                }
            }
        }
    }
}