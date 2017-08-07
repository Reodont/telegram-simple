package com.reodont.telegram.transmit;

import com.reodont.telegram.model.WrappedMessage;

public class PublisherImplementation implements Publisher {
    public void publish(WrappedMessage message, PubSubService pubSubService) {
        pubSubService.addMessageToQueue(message);
    }
}