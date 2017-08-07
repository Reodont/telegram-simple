package com.reodont.telegram.transmit;

import com.reodont.telegram.model.WrappedMessage;

public interface Publisher {
    void publish(WrappedMessage message, PubSubService pubSubService);
}