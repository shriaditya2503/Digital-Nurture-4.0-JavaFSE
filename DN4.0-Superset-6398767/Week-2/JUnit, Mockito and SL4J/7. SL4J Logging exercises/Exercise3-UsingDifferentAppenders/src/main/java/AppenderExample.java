import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("This message should go to both console and file");
        logger.warn("Warning logged to both outputs");
        logger.error("An error occurred");
    }
}

