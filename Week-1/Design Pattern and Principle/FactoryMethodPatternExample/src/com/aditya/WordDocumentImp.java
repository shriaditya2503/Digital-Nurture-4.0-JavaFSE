package com.aditya;

public class WordDocumentImp implements WordDocument {
    @Override
    public void open() {
        System.out.println("Opening Word Document...");
    }

    @Override
    public void saveAsPdf() {
        System.out.println("Saving as PDF...");
    }

    public void m1() {
        System.out.println("m1");
    }
}
