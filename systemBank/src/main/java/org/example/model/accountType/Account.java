package org.example.model.accountType;

import org.example.model.users.User;


public class Account {
    private static int increment = 1;
    private Integer id;
    private double bankBalance;
    private StatusAccount status;
    User user;

    public Account() {}
    public Account (double bankBalance, StatusAccount status){
        this.id = increment ++;
        this.bankBalance = bankBalance;
        this.status = status;
    }
    public Account( double bankBalance, StatusAccount status, User user) {
        this.id = user.getId();
        this.bankBalance = bankBalance;
        this.status = status;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
