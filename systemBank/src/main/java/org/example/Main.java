package org.example;

import java.io.IOException;

import org.example.service.ServiceStartAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello and welcome!");

        ServiceStartAccount c = new ServiceStartAccount();

        c.validationAccount();
        
        
    }
}