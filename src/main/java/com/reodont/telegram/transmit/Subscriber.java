/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram.transmit;

public abstract class Subscriber<E> {

    public abstract void onEvent(E e);

}