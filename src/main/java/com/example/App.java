package com.example;

//import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        var size = new AdultSize();
        var item1 = new Hoodie(size);
        item1.getType();
        item1.getSize().get();

        var size1 = new ChildSize();
        var item2 = new Shirt(size1);
        item2.getType();
        item2.getSize().get();
        
    }
}
