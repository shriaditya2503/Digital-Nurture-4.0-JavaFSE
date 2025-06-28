public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        logger1.log("Report generated");

        Logger logger2 = Logger.getLogger();
        logger2.log("Invoice generated");

        if(logger1 == logger2) System.out.println("Only one logger instance is used");
    }
}