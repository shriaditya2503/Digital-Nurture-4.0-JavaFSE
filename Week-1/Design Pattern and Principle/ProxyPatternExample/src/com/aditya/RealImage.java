package com.aditya;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromServer(fileName);
    }

    public void loadImageFromServer(String fileName) {
        System.out.println("Loading " + fileName + " from the server...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
