package org.example.service;

import org.example.model.users.User;
import org.example.service.Login.Login;
import org.example.service.serviceGlobalMethod.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CreateAccount {

    public void create() throws  IOException{
        System.out.println("WELCOME TO THE ACCOUNT SERVICE");
        //CONTINUAR DAQUI, IMPLEMENTAR UMA FUNÇÃO PARA PESQUISAR SE EXISTE POR EMAIL E POR FIM PROCURAR SE AS SENHAS BATE.
        Login login = new Login();
        login.login(); //Erro IDE

    }

    public User createUser() throws IOException {

        System.out.println("What is your name?: ");
            String name = Input.reader.readLine();

        System.out.println("What is your email address?: ");
            String email = Input.reader.readLine();

        System.out.println("Created your password?: ");
            String password = Input.reader.readLine();

        return new User(name,email,password);
    }

    private void validationPassword(){};


    
}
