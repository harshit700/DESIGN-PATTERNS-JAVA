package com.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesLeadTracker {
    public static void main(String[] args) {
        var person1 = new Person.PersonBuilder("Hrithik", "Roshan").dateOfBirth(LocalDate.of(1970,4,7))
                .emailAddress("hrithik@gmail.com").build();

        addPersonToLeadTracker(person1);

        var person2 = new Person.PersonBuilder("ShahRukh", "Khan").dateOfBirth(LocalDate.of(1965,11,2))
                .emailAddress("Shah@gmail.com").build();

        addPersonToLeadTracker(person2);
    }

    private static void addPersonToLeadTracker(Person person) {
        System.out.println("A new lead was added to the lead tracker: \n" + person);
    }

}