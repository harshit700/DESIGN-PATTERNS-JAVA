package com.example;

public class DocumentPrinter {

    public void printDocument() {
        var spooler = PrintSpooler.INSTANCE;
        spooler.print();
    }
}
