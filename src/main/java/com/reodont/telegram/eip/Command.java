/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.eip;

import com.reodont.telegram.dsl.Pipeline;
import com.reodont.telegram.dsl.PipelineBuilder;
import com.reodont.telegram.model.NewCommand;

public interface Command extends Message {

    Pipeline pipeline();

    default PipelineBuilder start(NewCommand event) {
        return new PipelineBuilder();
    }
}
