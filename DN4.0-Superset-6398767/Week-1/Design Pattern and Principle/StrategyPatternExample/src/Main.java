import com.aditya.CreditCardPayment;
import com.aditya.PayPalPayment;
import com.aditya.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.processPayment(25000.00);

        // Use PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.processPayment(15000.00);
    }
}