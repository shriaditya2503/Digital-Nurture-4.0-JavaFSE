import com.aditya.EmailNotifier;
import com.aditya.Notifier;
import com.aditya.SlackNotifierDecorator;
import com.aditya.SmsNotifierDecorator;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        notifier = new SmsNotifierDecorator(notifier);

        notifier = new SlackNotifierDecorator(notifier);

        notifier.send("System Alert: Server down!");
    }
}