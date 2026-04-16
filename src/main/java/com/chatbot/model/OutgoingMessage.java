package com.chatbot.model;

public class OutgoingMessage {

    private String to;
    private String reply;

    public OutgoingMessage() {
    }

    public OutgoingMessage(String to, String reply) {
        this.to = to;
        this.reply = reply;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    @Override
    public String toString() {
        return "OutgoingMessage{to='" + to + "', reply='" + reply + "'}";
    }
}
