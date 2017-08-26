/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

import com.reodont.telegram.dsl.PipelineBuilder;

import java.io.IOException;

public abstract class Subscriber<E> {

    private PipelineBuilder pipelineBuilder;

    public abstract void onEvent(E e) throws IOException;

    public Object getPipelineBuilder() {
        return pipelineBuilder;
    }

    public void setPipelineBuilder(PipelineBuilder pipelineBuilder) {
        this.pipelineBuilder = pipelineBuilder;
    }
}