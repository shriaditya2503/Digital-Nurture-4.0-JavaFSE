package com.aditya;

public class ExcelDocumentImp implements ExcelDocument {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }

    @Override
    public void export() {
        System.out.println("Exporting Excel Document...");
    }
}
