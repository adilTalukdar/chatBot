package com.chatbot.service;

import com.chatbot.model.IncomingMessage;
import com.chatbot.model.OutgoingMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    private static final Logger logger = LoggerFactory.getLogger(ChatbotService.class);

    public OutgoingMessage processMessage(IncomingMessage message) {

        logger.info("Incoming message from [{}]: \"{}\"", message.getFrom(), message.getBody());

        String bodyNormalized = message.getBody() == null
                ? ""
                : message.getBody().trim().toLowerCase();

        String reply;

        switch (bodyNormalized) {
            case "hi":
                reply = "Hello";
                break;
            case "bye":
                reply = "Goodbye";
                break;
            default:
                reply = "I don't understand";
                break;
        }

        logger.info("Sending reply to [{}]: \"{}\"", message.getFrom(), reply);

        return new OutgoingMessage(message.getFrom(), reply);
    }
}
