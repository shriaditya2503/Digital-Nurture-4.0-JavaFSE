public class Logger {
    private static Logger logger = null;

    private Logger() {
        System.out.println("Logger instance created");
    }

    public static Logger getLogger() {
        if(logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
