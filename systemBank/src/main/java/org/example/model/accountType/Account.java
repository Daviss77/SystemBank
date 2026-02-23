package org.example.model.accountType;

import java.math.BigDecimal;

public class Account {
    private BigDecimal bankBalance;
    private BigDecimal deposit;
    private BigDecimal withdraw;
    private StatusAccount status;

    public Account() {}
    public Account(BigDecimal bankBalance, BigDecimal deposit, BigDecimal withdraw, StatusAccount status) {
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

    public BigDecimal getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(BigDecimal withdraw) {
        this.withdraw = withdraw;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(BigDecimal bankBalance) {
        this.bankBalance = bankBalance;
    }
}
