public class MyService {
    private final ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void processAndSend(String input) {
        api.sendData(input.toUpperCase());
    }

    public void performRisky() {
        api.riskyOperation();
    }
}
