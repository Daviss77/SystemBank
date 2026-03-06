package org.example.service.serviceFunctionsAccount.user;

import org.example.controller.userController.ControllerAccessAccount;
import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;
import org.example.service.serviceGenericsFunctions.ServiceGeneSearchAccount;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;
import java.util.Optional;

public class ServiceDepositMoney extends Account {

    // Transaction pega o valor > Account altera balancebank > function deposit realiza as alterações > Depois se criaria uma função de Extrato para mostrar o valor ataul
    Transaction transaction = new Transaction();
    ServiceGeneSearchAccount search = new ServiceGeneSearchAccount();
    Input input = new Input();


    //IMPLEMENTANDO MANEIRAS DE UTILIZAR O VALUE DE TRANSACTION PARA DEPOSITAR O VALOR E ATUALIZAR O BANKBALANCE

    public void deposit(User userFound) throws IOException {
        
         Optional<Account> accountOpt = search.findAccountByUser(userFound.getId());
        
        if (accountOpt.isEmpty()) {
            System.out.println("Error: Account not found for this user!");
            return;
        }

        Account userAccount = accountOpt.get();

        System.out.println("-- SELECT DEPOSIT --");
        System.out.println("Deposit amount: ");
        String insert = Input.reader.readLine();
        transaction.setValue(input.convertStringToDouble(insert));
        
            if(transaction.getValue() > 0.0) {
                double newBalance = userAccount.getBankBalance() + transaction.getValue();
                userAccount.setBankBalance(newBalance);

                System.out.println("Deposit successful! Amount: " + transaction.getValue());
                System.out.println("New Balance: " + userAccount.getBankBalance());

            }else{
                System.out.println("Invalid amount. Deposit must be greater than zero.");
                
            }

    }
}
