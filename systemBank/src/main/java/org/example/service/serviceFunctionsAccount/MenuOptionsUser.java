package org.example.service.serviceFunctionsAccount;

import org.example.repository.FunctionsSystems;
import org.example.service.serviceFunctionsAccount.user.ServiceDepositMoney;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;
import java.util.Scanner;
public class MenuOptionsUser implements FunctionsSystems {
    Scanner scan = new Scanner(System.in);
    int value;
    @Override
    public void depositMoney() throws IOException {
        ServiceDepositMoney depositMoney = new ServiceDepositMoney();
    }

    @Override
    public void withdrawMoney() {

    }

    @Override
    public void transferMoney(){

    }
}
