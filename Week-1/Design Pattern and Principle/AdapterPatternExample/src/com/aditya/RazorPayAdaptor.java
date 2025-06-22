package com.aditya;

public class RazorPayAdaptor implements PaymentProcessor {
    private RazorPayGateway razorPayGateway;

    public RazorPayAdaptor(RazorPayGateway razorPayGateway) {
        this.razorPayGateway = razorPayGateway;
    }
    @Override
    public void processPayment(double amount) {
        razorPayGateway.sendAmount(amount);
    }
}
