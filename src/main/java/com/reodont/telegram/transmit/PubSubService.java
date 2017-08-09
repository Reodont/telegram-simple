/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.eip.Event;

import java.util.*;

public class PubSubService {

    //Keeps set of subscriber topic wise, using set to prevent duplicates
    private Map<Class<? extends Event>, Set<Subscriber>> subscribersTopicMap = new HashMap<>();

    //Holds messages published by publishers
    private Queue<Event> eventsQueue = new LinkedList<>();

    //Adds message sent by publisher to queue
    public void addEventToQueue(Event event) {
        eventsQueue.add(event);
    }

    //Add a new Subscriber for a topic
    public void addSubscriber(Event event, Subscriber subscriber) {

        if (subscribersTopicMap.containsKey(event.getClass())) {
            Set<Subscriber> subscribers = subscribersTopicMap.get(event);
            subscribers.add(subscriber);
            subscribersTopicMap.put(event.getClass(), subscribers);
        } else {
            Set<Subscriber> subscribers = new HashSet<>();
            subscribers.add(subscriber);
            subscribersTopicMap.put(event.getClass(), subscribers);
        }
    }

    //Removes an existing subscriber for a topic
    public void removeSubscriber(Event event, Subscriber subscriber) {

        if (subscribersTopicMap.containsKey(event.getClass())) {
            Set<Subscriber> subscribers = subscribersTopicMap.get(event);
            subscribers.remove(subscriber);
            subscribersTopicMap.put(event.getClass(), subscribers);
        }
    }


    //Broadcasts new messages added in queue to All subscribers of the topic. messagesQueue will be empty after broadcasting
    public void broadcast() {
        if (eventsQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!eventsQueue.isEmpty()) {
                Event event = eventsQueue.remove();

                Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(event.getClass());

                for (Subscriber subscriber : subscribersOfTopic) {
                    //add broadcasted message to subscribers message queue
                    List<Event> subscriberEvents = subscriber.getSubscriberEvents();
                    subscriberEvents.add(event);
                    subscriber.setSubscriberEvents(subscriberEvents);
                }
            }
        }
    }

    //Sends messages about a topic for subscriber
    public void getMessagesForSubscriberOfTopic(Event event, Subscriber subscriber) {
        if (eventsQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!eventsQueue.isEmpty()) {
                Event tempEvent = eventsQueue.remove();

                if (event.getClass().equals(tempEvent.getClass())) {

                    Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(event);

                    for (Subscriber _subscriber : subscribersOfTopic) {
                        if (_subscriber.equals(subscriber)) {
                            //Adds broadcast message to subscriber message queue
                            List<Event> subscriberEvents = subscriber.getSubscriberEvents();
                            subscriberEvents.add(tempEvent);
                            subscriber.setSubscriberEvents(subscriberEvents);
                        }
                    }
                }
            }
        }
    }

}