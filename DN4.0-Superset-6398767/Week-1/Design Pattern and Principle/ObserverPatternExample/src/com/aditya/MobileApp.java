package com.aditya;

public class MobileApp implements Observer {
    private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App " + name + " received update: Stock price is Rs." + stockPrice);
    }
}
