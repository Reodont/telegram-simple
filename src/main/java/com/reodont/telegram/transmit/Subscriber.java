package com.reodont.telegram.transmit;

import com.reodont.telegram.model.WrappedMessage;

import java.util.ArrayList;
import java.util.List;

public abstract class Subscriber {
    //store all messages received by the subscriber
    private List<WrappedMessage> subscriberMessages = new ArrayList<WrappedMessage>();

    public List<WrappedMessage> getSubscriberMessages() {
        return subscriberMessages;
    }

    public void setSubscriberMessages(List<WrappedMessage> subscriberMessages) {
        this.subscriberMessages = subscriberMessages;
    }

    public abstract void addSubscriber(String topic, PubSubService pubSubService);

    public abstract void unSubscribe(String topic, PubSubService pubSubService);

    public abstract void getMessagesForSubscriberOfTopic(String topic, PubSubService pubSubService);

    public void printMessages() {
        for (WrappedMessage message : subscriberMessages) {
            System.out.println("Message Topic -> " + message.getTopic() + " : " + message.getMsg());
        }
    }
}