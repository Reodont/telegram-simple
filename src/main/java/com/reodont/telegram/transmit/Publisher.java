/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.eip.Event;

public interface Publisher {
    void publish(Event event, PubSubService pubSubService);
}