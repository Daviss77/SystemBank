package org.example.controller.userController;

import java.io.IOException;

import org.example.model.accountType.Account;
import org.example.model.accountType.StatusAccount;
import org.example.model.users.User;
import org.example.service.serviceGlobalMethod.Input;
import org.example.service.serviceSaveData.ServiceSaveData;

public class ControllerInsertUser {

    public User createUser() throws IOException {

        User newUser = new User();

        System.out.println("What is your name?: ");
        String name = Input.reader.readLine();
        newUser.setUsername(name);

        System.out.println("What is your email address?: ");
        String email = Input.reader.readLine();
        newUser.setEmail(email);

        System.out.println("Created your password?: ");
        String password = Input.reader.readLine();
        newUser.setPassword(password);

        //Created Account
        Account newAccount = new Account(
            0.0,
            StatusAccount.ACTIVE
        );

        newUser.setAccount(newAccount);
        newAccount.setUser(newUser);

        ServiceSaveData saveDB = new ServiceSaveData();
        saveDB.saveUserWithAccount(newUser, newAccount);
        
        System.out.println("Welcome to your account service");

        return newUser;

        
    }

}
