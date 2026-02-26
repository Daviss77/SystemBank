package org.example.service.serviceGlobalMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    // Um único leitor para o projeto todo
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
}