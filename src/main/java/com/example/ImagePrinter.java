package com.example;

public class ImagePrinter {

    public void printImage() {
        var spooler = PrintSpooler.INSTANCE;
        spooler.print();
    }
}
