/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.dsl;

import com.reodont.telegram.eip.Event;
import com.reodont.telegram.model.NewCommand;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class PipelineBuilder {

    private Event event;

    public PipelineBuilder() {
    }

    public PipelineBuilder(Event event) {
        this.event = (NewCommand) event;
    }

    public PipelineBuilder firstStep(Consumer handleMessage) {
        handleMessage.accept("All is fine!");
        return this;
    }

    public PipelineBuilder nextStep(Supplier handleMessage) {
        handleMessage.get();
        return this;
    }

    public Pipeline done() {
        return null;
    }

}
