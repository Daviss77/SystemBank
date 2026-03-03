package org.example.service.serviceFunctionsAccount.user;

import org.example.controller.userController.ControllerAccessAccount;
import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;

public class ServiceDepositMoney extends Account {

    // Transaction pega o valor > Account altera balancebank > function deposit realiza as alterações > Depois se criaria uma função de Extrato para mostrar o valor ataul
    Transaction transaction = new Transaction();
    User userFound;
    Input input = new Input();

    //IMPLEMENTANDO MANEIRAS DE UTILIZAR O VALUE DE TRANSACTION PARA DEPOSITAR O VALOR E ATUALIZAR O BANKBALANCE

    public void deposit(User userFound) throws IOException {
        ControllerAccessAccount accessAccount = new ControllerAccessAccount();
        System.out.println("-- SELECT DEPOSIT --");
        System.out.println("Deposit amount: ");
        String insert = Input.reader.readLine();
        transaction.setValue(input.convertStringToDouble(insert));
        
            if(transaction.getValue() > 0.0) {
                System.out.println("Deposit successful! Amount: " + transaction.getValue());
                updateBalanceBank();
                accessAccount.accessAccount();
            }else{
                System.out.println("Invalid amount. Deposit must be greater than zero.");
                accessAccount.accessAccount();
            }

    }

    private void updateBalanceBank() {
        double currentBalance = getBankBalance();
        double newBalance = currentBalance + transaction.getValue();
        setBankBalance(newBalance);
    }
}
