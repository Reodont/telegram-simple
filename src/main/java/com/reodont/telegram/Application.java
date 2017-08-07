package com.reodont.telegram;

import com.reodont.telegram.model.Update;
import com.reodont.telegram.model.WrappedMessage;
import com.reodont.telegram.subcriber.MessageAnswer;
import com.reodont.telegram.transmit.PubSubService;
import com.reodont.telegram.transmit.Publisher;
import com.reodont.telegram.transmit.PublisherImplementation;
import com.reodont.telegram.transmit.Request;
import com.reodont.telegram.util.ResourceUtils;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Application {
    public static void main(String[] args) throws IOException {
        Request a = new Request();
        Properties properties = ResourceUtils.getResourceAsProperties("token.properties");
        String token = properties.getProperty("telegram.token");
        List<Update> b = a.getUpdates(token);

        Publisher pubA = new PublisherImplementation();
        PubSubService pubService = new PubSubService();
        MessageAnswer messageAnswer = new MessageAnswer(pubService);


        for (Update update : b) {
            WrappedMessage msg = new WrappedMessage(update);
            pubA.publish(msg, pubService);
        }
        pubService.broadcast();

        for (WrappedMessage wrappedMessage : messageAnswer.getSubscriberMessages()) {
            messageAnswer.answerUniversal(wrappedMessage, token);
        }
    }
}
