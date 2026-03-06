package org.example.service.serviceGenericsFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.model.accountType.Account;
import org.example.model.users.User;
import org.example.repository.database.MockDatabase;

public class ServiceGeneSearchAccount extends MockDatabase{
   
        public Optional<User> findByID(Integer userID) {
            return users.stream()
                    .filter(u -> u.getId().equals(userID))
                    .findFirst();
        }

        public Optional<User> findByEmail(String email) {
            return users.stream()
                    .filter(u -> u.getEmail().equalsIgnoreCase(email))
                    .findFirst();
        }

        public Optional<Account> findAccountByUser(Integer userID) {
        return accounts.stream()
                .filter(account -> account.getUser() != null && 
                        account.getUser().getId().equals(userID))
                .findFirst();
    }

}


