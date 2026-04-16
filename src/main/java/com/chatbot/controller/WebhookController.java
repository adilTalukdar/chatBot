package com.chatbot.controller;

import com.chatbot.model.IncomingMessage;
import com.chatbot.model.OutgoingMessage;
import com.chatbot.service.ChatbotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @GetMapping
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("WhatsApp Chatbot is running!");
    }

    @PostMapping
    public ResponseEntity<OutgoingMessage> receiveMessage(@RequestBody IncomingMessage incomingMessage) {
        logger.debug("Webhook triggered");
        OutgoingMessage response = chatbotService.processMessage(incomingMessage);
        return ResponseEntity.ok(response);
    }
}
