package org.example.service.serviceFunctionsAccount.user;

import org.example.model.accountType.Account;
import org.example.model.users.User;

import javax.crypto.spec.PSource;
import java.io.IOException;

public class ServiceWithdrawMoney extends ServiceAccountTransaction{
    public void withdraw(User userFound ) throws IOException{
            executeTransaction(userFound, "-- SELECT WITHDRAW -- ", - 1.0);
    }

    @Override
    protected boolean validateTransaction(Account account, double amount){
        if(amount >= 0.0){
            System.out.println("Invalid amount. Withdraw must be greater tha zero.");
            return false;
        }
        if(account.getBankBalance() + amount < 0){
            System.out.println("Insufficient funds! Current balance is " + account.getBankBalance());
            return false;
        }
        return true;
    }

    @Override
    public String getSuccessMessage(double amount) {
        return "Withdraw success! Amount " + amount;
    }

}
