package org.example.controller.userController;

import org.example.model.users.User;
import org.example.service.serviceFunctionsAccount.user.ServiceDepositMoney;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;



public class ControllerAccessAccount {
    private User userLogged;

    public ControllerAccessAccount(User userLogged){
        this.userLogged = userLogged;
    }

    public void accessAccount() throws IOException {

        System.out.println("YOUR BANK SYSTEM");

        System.out.println("-=-=-=-=-=-=  FEATURES  -=-=-=-=-=-=\n1 -> DEPOSIT\n2 -> WITHDRAW\n3 -> TRANSFER MONEY");
        String opS = Input.reader.readLine();
        int opI = Integer.parseInt(opS);
            switch (opI){
                case 1 -> {
                    ServiceDepositMoney deposit = new ServiceDepositMoney();
                    deposit.deposit(userLogged);
                }
        }
    }
}
