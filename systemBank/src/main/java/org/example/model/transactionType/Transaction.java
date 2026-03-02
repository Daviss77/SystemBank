package org.example.model.transactionType;

import org.example.model.users.User;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private static int increment = 1;
    private int id;
    private double value;
    private TypeTransaction type;
    private StatusTransaction status;
    private LocalDateTime dateCreated;
    private User user;

    public Transaction(int id, double value, TypeTransaction type, StatusTransaction status, LocalDateTime dateCreated, User user) {
        this.id = increment++;
        this.value = value;
        this.type = type;
        this.status = status;
        this.user = user;
        this.dateCreated = LocalDateTime.now();
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public double getValue() {return value;}

    public void setValue(double value) {
        this.value = value;
    }

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }

    public StatusTransaction getStatus() {
        return status;
    }

    public void setStatus(StatusTransaction status) {
        this.status = status;
    }


}
