package org.example.service.serviceFunctionsAccount.user;

import org.example.model.users.User;
import org.example.service.serviceGenericsFunctions.ServiceGeneSearchAccount;
import org.example.service.serviceGlobalMethod.Input;

import java.io.IOException;

public class ServiceTransferMoney {
    //Buscar user pelo email, ao encontrar informar o saldo disponivel e quanto deseja transferir
    //logic bussinnes conta ficar menos o valor transferido e a conta encontrada aumentar o saldo
    double valueT= 0;

    ServiceGeneSearchAccount search = new ServiceGeneSearchAccount();
    Input input = new Input();
    User searchUser;
    public void transfer (User userFond) throws IOException {
        System.out.println("BALANCE IN YOUR ACCOUNT: " + userFond.getAccount().getBankBalance());
        User userSearchT = searchTransfer();
        if(userSearchT == null){
            System.out.println("ACCOUNT NOT FOUND");
            return;
        }
        amountTransfer();
        if (userFond.getAccount().getBankBalance() <= 0 || valueT  > userFond.getAccount().getBankBalance()) {
            System.out.println("BALANCE NEGATIVE OR BALANCE INSUFFICIENT ");
        }
        else{
            System.out.println("TRANSFER SUCCESSFUL");
            var successTransfer = userSearchT.getAccount().getBankBalance() + valueT;
            userSearchT.getAccount().setBankBalance(successTransfer);

            userFond.getAccount().setBankBalance(userFond.getAccount().getBankBalance() - valueT);
        }

    }


    private double amountTransfer() throws IOException {
        System.out.println("HOW MUCH DO YOU WANT TO TRANSFER ");
        String v1 = Input.reader.readLine();
        valueT = input.convertStringToDouble(v1);

        return valueT;
    }

    private User searchTransfer () throws IOException {
        System.out.println("WHICH ACCOUNT DO YOU WANT TO TRANSFER THE MONEY TO? ");
        String email = Input.reader.readLine();
        var userFound = search.findByEmail(email);
            if (userFound.isPresent()) {
                System.out.println("ACCOUNT FOUND " + userFound.get().getEmail());
                return userFound.get();
            }
            return null;
    }
}
