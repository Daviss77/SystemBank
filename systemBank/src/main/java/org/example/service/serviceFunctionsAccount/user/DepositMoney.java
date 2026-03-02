package org.example.service.serviceFunctionsAccount.user;

import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;
import java.math.BigDecimal;

public class DepositMoney extends Transaction {

    // Transaction pega o valor > Account altera balancebank > function deposit realiza as alterações > Depois se criaria uma função de Extrato para mostrar o valor ataul
    Account account =  new Account();
    User userFound;

    public void deposit(User userFound) throws IOException {
        System.out.println("-- SELECT DEPOSIT --");
        System.out.println("Deposit amount: ");
            String insertValue = Input.reader.readLine();
            double iValue = Double.parseDouble(insertValue);


    }
}
