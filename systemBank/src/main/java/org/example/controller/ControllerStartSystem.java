package org.example.controller;

import java.io.IOException;

import org.example.service.serviceLogin.Login;
import org.example.service.serviceGlobalMethod.Input;
import org.example.view.CreateAccountView;
import org.example.controller.userController.*;
public class ControllerStartSystem {
    
    CreateAccountView view = new CreateAccountView();

    public void systemAccount() throws IOException{
        int option;
        
        do{    
            view.welcomeSystem();
            option = Integer.valueOf(Input.reader.readLine());
                switch (option) {
                    case 1 -> {
                        Login login = new Login();
                        ControllerAccessAccount start = new ControllerAccessAccount(login.login());
                        start.accessAccount();
                    }
                    case 2 -> {
                        ControllerInsertUser createUser = new ControllerInsertUser();
                        createUser.createUser();
                    }
                    case 3 -> {
                        System.out.println("Exit system");
                    }
                    default -> {
                        System.out.println("Value invalid");
                    }
                }
            }   while(option != 3);
    };


}
