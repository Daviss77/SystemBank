package org.example.service.serviceFunctionsAccount.user;

import org.example.controller.userController.ControllerAccessAccount;
import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;
import org.example.service.serviceGenericsFunctions.ServiceGeneSearchAccount;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;
import java.util.Optional;

public class ServiceDepositMoney extends ServiceAccountTransaction {

        public void deposit(User userFound) throws IOException{
            executeTransaction(userFound, "-- SELECT DEPOSIT -- ", 1.0);
        }

        @Override
        public boolean validateTransaction(Account account, double amount) {
            if(amount <= 0.0){
                System.out.println("Invalid amount. Deposit amount must be greater than 0.");
                return false;
            }
            return true;
        }
        @Override
        public String getSuccessMessage(double amount) {
            return "Deposited success! Amount " + amount;
        }
}
