package com.reodont.telegram.dsl;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.NewCommand;
import com.reodont.telegram.model.object.Message;
import com.reodont.telegram.transmit.Request;

import java.util.Queue;
import java.util.function.Consumer;


public abstract class PipelineBuilder {

    public abstract Queue<Consumer<Event>> createPipelineQueue();

    public void thenReply(Event event, String text) {
        try {
            new Request().sendMessage(new Message((NewCommand) event, text));
        } catch (Exception e) {
        }
    }

}
