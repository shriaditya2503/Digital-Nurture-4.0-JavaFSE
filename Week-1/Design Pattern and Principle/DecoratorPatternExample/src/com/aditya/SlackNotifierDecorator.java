package com.aditya;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSlack(msg);
    }

    public void sendSlack(String msg) {
        System.out.println("Sending slack: " + msg);
    }
}
