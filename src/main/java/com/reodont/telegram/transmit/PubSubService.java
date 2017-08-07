package com.reodont.telegram.transmit;

import com.reodont.telegram.model.WrappedMessage;

import java.util.*;

public class PubSubService {

    //Holds topics
    public static final Set<String> topicSet = new HashSet<>();

    //Keeps set of subscriber topic wise, using set to prevent duplicates
    private Map<String, Set<Subscriber>> subscribersTopicMap = new HashMap<>();

    //Holds messages published by publishers
    private Queue<WrappedMessage> messagesQueue = new LinkedList<>();

    //Adds message sent by publisher to queue
    public void addMessageToQueue(WrappedMessage message) {
        messagesQueue.add(message);
    }

    //Add a new Subscriber for a topic
    public void addSubscriber(String topic, Subscriber subscriber) {

        if (subscribersTopicMap.containsKey(topic)) {
            Set<Subscriber> subscribers = subscribersTopicMap.get(topic);
            subscribers.add(subscriber);
            subscribersTopicMap.put(topic, subscribers);
        } else {
            Set<Subscriber> subscribers = new HashSet<>();
            subscribers.add(subscriber);
            subscribersTopicMap.put(topic, subscribers);
        }
    }

    //Removes an existing subscriber for a topic
    public void removeSubscriber(String topic, Subscriber subscriber) {

        if (subscribersTopicMap.containsKey(topic)) {
            Set<Subscriber> subscribers = subscribersTopicMap.get(topic);
            subscribers.remove(subscriber);
            subscribersTopicMap.put(topic, subscribers);
        }
    }

    //Adds new topic
    public static void setTopics() {
        topicSet.add("message");
        topicSet.add("editedMessage");
        topicSet.add("channelPost");
        topicSet.add("editedChannelPost");
        topicSet.add("null");
    }

    //Broadcasts new messages added in queue to All subscribers of the topic. messagesQueue will be empty after broadcasting
    public void broadcast() {
        if (messagesQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!messagesQueue.isEmpty()) {
                WrappedMessage message = messagesQueue.remove();
                String topic = message.getTopic();

                Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(topic);

                for (Subscriber subscriber : subscribersOfTopic) {
                    //add broadcasted message to subscribers message queue
                    List<WrappedMessage> subscriberMessages = subscriber.getSubscriberMessages();
                    subscriberMessages.add(message);
                    subscriber.setSubscriberMessages(subscriberMessages);
                }
            }
        }
    }

    //Sends messages about a topic for subscriber
    public void getMessagesForSubscriberOfTopic(String topic, Subscriber subscriber) {
        if (messagesQueue.isEmpty()) {
            System.out.println("No messages from publishers to display");
        } else {
            while (!messagesQueue.isEmpty()) {
                WrappedMessage message = messagesQueue.remove();

                if (message.getTopic().equalsIgnoreCase(topic)) {

                    Set<Subscriber> subscribersOfTopic = subscribersTopicMap.get(topic);

                    for (Subscriber _subscriber : subscribersOfTopic) {
                        if (_subscriber.equals(subscriber)) {
                            //Adds broadcast message to subscriber message queue
                            List<WrappedMessage> subscriberMessages = subscriber.getSubscriberMessages();
                            subscriberMessages.add(message);
                            subscriber.setSubscriberMessages(subscriberMessages);
                        }
                    }
                }
            }
        }
    }

}