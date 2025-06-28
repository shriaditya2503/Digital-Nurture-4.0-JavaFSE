package com.aditya;

public class SmsNotifierDecorator extends NotifierDecorator {

    public SmsNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSms(msg);
    }

    public void sendSms(String msg) {
        System.out.println("Sending SMS: " + msg);
    }
}
