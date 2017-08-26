/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.dsl;

import com.reodont.telegram.transmit.Subscriber;

import java.io.IOException;

public abstract class Pipeline extends Subscriber {

    public Pipeline() {
    }

    public Pipeline(PipelineBuilder pipelineBuilder) {
        this.setPipelineBuilder(pipelineBuilder);
    }

    public abstract void onEvent(Object event) throws IOException;
}
