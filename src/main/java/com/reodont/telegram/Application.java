/*
 * Copyright (c) 2017.  Roman Kvasnytskyy.
 */

package com.reodont.telegram;

import com.reodont.telegram.model.Bot;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Bot bot = new Bot();
        bot.longPolling();
    }
}
