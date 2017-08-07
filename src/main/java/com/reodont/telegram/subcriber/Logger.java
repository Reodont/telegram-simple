package com.reodont.telegram.subcriber;

import com.reodont.telegram.model.WrappedMessage;
import com.reodont.telegram.transmit.PubSubService;
import com.reodont.telegram.transmit.SubscribeImplementation;

public class Logger extends SubscribeImplementation {
    public void subscribeToAll(PubSubService pubSubService) {
        for (String topic : PubSubService.topicSet) {
            pubSubService.addSubscriber(topic, this);
        }
    }

    public void logMessage(WrappedMessage message) {
        System.out.println(message.getMsg());
    }

}
