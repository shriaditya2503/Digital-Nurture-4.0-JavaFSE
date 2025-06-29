import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "aditya";
        int userId = 101;

        logger.info("User {} has ID {}", username, userId);
        logger.debug("Debugging user {} with ID {}", username, userId);
    }
}
