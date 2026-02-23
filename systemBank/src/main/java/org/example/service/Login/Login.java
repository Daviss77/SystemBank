package org.example.service.Login;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.example.model.users.User;
import org.example.service.CreateAccount;
import org.example.service.genericsFunctions.FunctionsAdmin;

public class Login {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    FunctionsAdmin f = new FunctionsAdmin();
    User searchID = new User();
    User searchEmail = new User();

    public void login() throws IOException{
        System.out.println("To continue, please enter your email address: ");
        String email = reader.readLine();
        
        //VALIDAR A FUNÇÃO CADASTRO
        searchEmail.setEmail(email);
            if (f.searchAccounts(searchEmail).equals(null)) {
                System.out.println("User not found");
                CreateAccount createAccount = new CreateAccount();
                createAccount.createAccount();
            }
    }
}
