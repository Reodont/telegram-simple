package com.reodont.telegram.subcriber;

import com.reodont.telegram.model.Message;
import com.reodont.telegram.model.WrappedMessage;
import com.reodont.telegram.transmit.PubSubService;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.transmit.SubscribeImplementation;

import java.io.IOException;

public class MessageAnswer extends SubscribeImplementation {
    public MessageAnswer(PubSubService pubSubService) {
        this.addSubscriber("message", pubSubService);
    }

    public void answerUniversal(WrappedMessage wrappedMessage, String token) throws IOException {
        Request request = new Request();
        Message message = new Message(wrappedMessage.getMsg().chat(), "Hello World, this my universal answer to all your messages!");

        request.sendMessage(message, token);
        return;
    }
}
