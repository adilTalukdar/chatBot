package com.chatbot.model;

public class IncomingMessage {

    private String from;
    private String body;

    public IncomingMessage() {
    }

    public IncomingMessage(String from, String body) {
        this.from = from;
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "IncomingMessage{from='" + from + "', body='" + body + "'}";
    }
}
