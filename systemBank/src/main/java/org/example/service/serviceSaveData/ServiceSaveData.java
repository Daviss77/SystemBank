package org.example.service.serviceSaveData;

import java.util.UUID;

import org.example.model.accountType.Account;
import org.example.model.users.User;
import org.example.repository.database.MockDatabase;

public class ServiceSaveData {

    public void saveUserWithAccount(User user, Account account) {
        // Associa o usuário à conta
        account.setUser(user);
        user.setAccount(account);
        
        // Salva no MockDatabase
        MockDatabase.users.add(user);
        MockDatabase.accounts.add(account);
        
        System.out.println("✓ User and Account saved successfully!");
        System.out.println("  User ID: " + user.getId() + " | Email: " + user.getEmail());
        System.out.println("  Account ID: " + account.getId() + " | Balance: R$" + account.getBankBalance());
    }
    
}
