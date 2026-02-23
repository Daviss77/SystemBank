package org.example.service;

import org.example.model.users.User;
import org.example.service.genericsFunctions.AccountGenerics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CreateAccount {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    AccountGenerics f = new AccountGenerics();
    public void createAccount() throws  IOException{
        System.out.println("WELCOME TO THE ACCOUNT SERVICE");
        System.out.println("To continue, please enter your email address: ");
        String email = reader.readLine();
        //CONTINUAR DAQUI, IMPLEMENTAR UMA FUNÇÃO PARA PESQUISAR SE EXISTE POR EMAIL E POR FIM PROCURAR SE AS SENHAS BATE.
        f.searchAccounts(email);

    }

    public User createUser() throws IOException {

        System.out.println("What is your name?: ");
            String name = reader.readLine();

        System.out.println("What is your email address?: ");
            String email = reader.readLine();

        System.out.println("Created your password?: ");
            String password = reader.readLine();

        return new User(name,email,password);
    }

    private void validationPassword(){};
}
