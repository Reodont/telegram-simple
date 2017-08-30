/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.dsl;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.NewCommand;
import com.reodont.telegram.model.object.Message;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.transmit.Subscriber;

import java.util.Queue;
import java.util.function.Consumer;

@SuppressWarnings("unchecked")
public class Pipeline extends Subscriber {

    Queue<Consumer<Event>> pipelineQueue;

    public Pipeline(PipelineBuilder pipelineBuilder) {
        pipelineQueue = pipelineBuilder.createPipelineQueue();
    }

    public void onEvent(Object event) {
        try {
            Request request = new Request();

            if (!pipelineQueue.isEmpty()) {
                Consumer consumer = pipelineQueue.remove();
                consumer.accept(event);
            } else request.sendMessage(new Message((NewCommand) event, "Command execution ended!"));
        } catch (ClassCastException classCastException) {
            System.out.println("Something went wrong :c");
        } catch (Exception exception) {
        }

    }
}
