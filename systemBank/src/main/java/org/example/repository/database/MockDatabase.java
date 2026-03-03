package org.example.repository.database;

import java.util.ArrayList;
import java.util.List;

import org.example.model.accountType.Account;
import org.example.model.transactionType.Transaction;
import org.example.model.users.User;

public class MockDatabase {
    public static List<User> users = new ArrayList<>();
    public static List<Account> accounts = new ArrayList<>();
    public static List<Transaction> transactions = new ArrayList<>();
}

