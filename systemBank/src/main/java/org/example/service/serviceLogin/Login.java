package org.example.service.serviceLogin;

import java.io.IOException;

import org.example.controller.ControllerStartSystem;
import org.example.controller.userController.ControllerAccessAccount;
import org.example.model.accountType.Account;
import org.example.model.users.User;
import org.example.service.serviceGenericsFunctions.ServiceGeneSearchAccount;
import org.example.service.serviceGlobalMethod.Input;

public class Login {
    
    ServiceGeneSearchAccount search = new ServiceGeneSearchAccount();

    public User login() throws IOException{
        System.out.println("To continue, please enter your email address: ");
        String email = Input.reader.readLine();
        var userFound = search.findByEmail(email);

        //VALIDAR A FUNÇÃO CADASTRO
            if (userFound.isEmpty()){
                System.out.println("Email not found... Redirecting to  Account Creation");
                ControllerStartSystem system = new ControllerStartSystem();
                system.systemAccount();
            }else {
                User u =  userFound.get();

                    if(u != null && validationPassword(u)){
                            System.out.println("Login successful! Welcome "+ u.getEmail());
                        
                            var accountFound = search.findAccountByUser(u.getId());
                                if(accountFound.isPresent()){
                                    Account userAccount = accountFound.get();
                                    System.out.println("Account found! Balance: " + userAccount.getBankBalance());
                                }
                                else{
                                    System.out.println("Warning: No account associated with this user!");
                                }

                                ControllerAccessAccount accessAccount = new ControllerAccessAccount(u);
                                accessAccount.accessAccount();

                                return u;
                    }else {
                        System.out.println("Too many failed attempts. Account locked");
                    }
            }
            return null;
    }

    private boolean validationPassword(User userFound) throws IOException {
        int counter = 0;
        int maxAttempts = 3;

        while (counter < maxAttempts) {
            System.out.println("Enter your password (" + (maxAttempts - counter) + " attempts left): ");
            String typedPassword = Input.reader.readLine();

            // Compara a senha digitada com a senha do usuário
            if (userFound.getPassword().equals(typedPassword)) {
                System.out.println("Password Match!");
                return true;
            } else {
                counter++;
                if (counter < maxAttempts) {
                    System.out.println("Invalid password. Try again.");
                }
            }
        }
        return false;
    }
}
