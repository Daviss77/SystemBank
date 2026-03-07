package org.example.service.serviceFunctionsAccount.user;

import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;
import org.example.service.serviceGenericsFunctions.ServiceGeneSearchAccount;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class ServiceAccountTransaction extends Account {
    protected Transaction transaction = new Transaction();
    protected ServiceGeneSearchAccount search = new ServiceGeneSearchAccount();
    protected Input input = new Input();

    protected void executeTransaction(User userFound, String operationName, double multiple) throws IOException {
        Optional<Account> accountOpt = search.findAccountByUser(userFound.getId());
        if(accountOpt.isEmpty()){
            System.out.println("ERROR: Account not found for this user! ");
            return;
        }

        Account account = accountOpt.get();
        System.out.println(operationName);
        System.out.println("Amount: " );
        String insert = Input.reader.readLine();

        double amount = input.convertStringToDouble(insert);
        double transactionAmount = amount * multiple;

        if(!validateTransaction(account, transactionAmount)){
            return;
        }

        transaction.setValue(transactionAmount);
        double newBalance = account.getBankBalance() + transactionAmount;
        account.setBankBalance(newBalance);

        System.out.println(getSuccessMessage(transactionAmount));
        System.out.println("New Balance: " + account.getBankBalance());
    }

    protected abstract boolean validateTransaction(Account account, double amount);
    protected abstract String getSuccessMessage(double amount);
}
