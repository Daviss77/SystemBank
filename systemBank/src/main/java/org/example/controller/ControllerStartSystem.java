package org.example.controller;

import java.io.IOException;

import org.example.service.ServiceStartAccount;
import org.example.service.Login.Login;
import org.example.service.serviceGlobalMethod.Input;
import org.example.view.CreateAccountView;

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
                        login.login();
                    }  
                    case 2 -> {
                        ServiceStartAccount createUser = new ServiceStartAccount();
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
