package org.example.controller.userController;

import org.example.service.serviceFunctionsAccount.MenuOptionsUser;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;



public class ControllerAccessAccount {
    protected MenuOptionsUser menu = new MenuOptionsUser();

    public void accessAccount() throws IOException {

        System.out.println("YOUR BANK SYSTEM");

        System.out.println("-=-=-=-=-=-=  FEATURES  -=-=-=-=-=-=\n1 -> DEPOSIT\n2 -> WITHDRAW\n3 -> TRANSFER MONEY");
        String opS = Input.reader.readLine();
        int opI = Integer.parseInt(opS);
            switch (opI){
                case 1 -> {
                    menu.depositMoney();
                }
        }
    }
}
