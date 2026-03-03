package org.example.service.serviceGlobalMethod;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    // Um único leitor para o projeto todo
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Double convertStringToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return null;
        }
    }
}