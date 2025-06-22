package com.aditya;

public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }
    @Override
    public void update(double stockPrice) {
        System.out.println("Web App " + name + " received update: Stock price is Rs." + stockPrice);
    }
}
