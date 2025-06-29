package service;

import interfaces.RestClient;

public class ApiService {
    private final RestClient client;
    public ApiService(RestClient client) {
        this.client = client;
    }

    public String fetchData() {
        return "Fetched " + client.getResponse();
    }
}
