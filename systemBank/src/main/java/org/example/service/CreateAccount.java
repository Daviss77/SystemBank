package org.example.service;

import org.example.model.users.User;
import org.example.service.Login.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CreateAccount {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public void createAccount() throws  IOException{
        System.out.println("WELCOME TO THE ACCOUNT SERVICE");
        //CONTINUAR DAQUI, IMPLEMENTAR UMA FUNÇÃO PARA PESQUISAR SE EXISTE POR EMAIL E POR FIM PROCURAR SE AS SENHAS BATE.
        Login login = new Login();
        login.login();

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
