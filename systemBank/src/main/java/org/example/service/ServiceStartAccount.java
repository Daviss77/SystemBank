package org.example.service;

import org.example.model.users.User;
import org.example.service.Login.Login;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;


public class ServiceStartAccount {

    public User createUser() throws IOException {

        System.out.println("What is your name?: ");
        String name = Input.reader.readLine();

        System.out.println("What is your email address?: ");
        String email = Input.reader.readLine();

        System.out.println("Created your password?: ");
        String password = Input.reader.readLine();

        System.out.println("Welcome to your account service");
        return new User(name,email,password);
    }


    public void validationAccount() throws  IOException{
        System.out.println("WELCOME TO THE ACCOUNT SERVICE");
        Login login = new Login();
        login.login();

    }

}
