package com.aditya;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
