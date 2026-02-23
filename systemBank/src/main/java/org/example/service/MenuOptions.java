package org.example.service;

import org.example.repository.FunctionsSystems;
import java.util.Scanner;
public class MenuOptions implements FunctionsSystems {
    Scanner scan = new Scanner(System.in);
    int value;
    @Override
    public void depositMoney() {
        System.out.println("How much do you want to deposit in your account?");
        value = scan.nextInt();
        System.out.println("Value added in your account? " + value);
    }

    @Override
    public void withdrawMoney() {

    }

    @Override
    public void transferMoney(){

    }
}
