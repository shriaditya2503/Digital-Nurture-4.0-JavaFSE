package com.aditya;

public class PdfDocumentImp implements PdfDocument {
    @Override
    public void open() {
        System.out.println("Opening PDF Document...");
    }

    @Override
    public void download() {
        System.out.println("Downloading PDF Document...");
    }
}
