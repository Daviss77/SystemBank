package org.example.model.accountType;

import org.example.model.users.User;

import java.math.BigDecimal;

public class Account extends User {
    private double bankBalance;
    private double deposit;
    private double withdraw;
    private StatusAccount status;

    public Account() {}
    public Account(double bankBalance, double deposit, double withdraw, StatusAccount status) {
        this.bankBalance = bankBalance;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.status = status;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}
