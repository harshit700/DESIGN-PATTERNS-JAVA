package com.example;

//import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Login {
    public static void main(String[] args) {

        var user = new BasicUser();
        user.printPrivileges();
        System.out.println();

        var adminUser = new AdminUser(user);
        adminUser.printPrivileges();

        System.out.println();

        var developerUser = new DeveloperUser(adminUser);
        developerUser.printPrivileges();

    }

}