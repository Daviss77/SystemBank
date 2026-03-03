package org.example.model.accountType;

import org.example.model.users.User;

import java.math.BigDecimal;

public class Account {
    private double bankBalance;
    private StatusAccount status;
    User user;

    public Account() {}
    public Account(double bankBalance, StatusAccount status) {
        this.bankBalance = bankBalance;
        this.status = status;
    }

    public StatusAccount getStatus() {
        return status;
    }

    public void setStatus(StatusAccount status) {
        this.status = status;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }
}
