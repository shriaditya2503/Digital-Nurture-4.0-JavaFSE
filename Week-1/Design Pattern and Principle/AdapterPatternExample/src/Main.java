import com.aditya.*;

public class Main {
    public static void main(String[] args) {
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalPayment = new PayPalAdaptor(payPalGateway);
        payPalPayment.processPayment(2000.0);

        RazorPayGateway razorPayGateway = new RazorPayGateway();
        PaymentProcessor razorPayPayment = new RazorPayAdaptor(razorPayGateway);
        razorPayPayment.processPayment(5000.0);
    }
}