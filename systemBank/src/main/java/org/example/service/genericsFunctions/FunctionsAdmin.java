package org.example.service.genericsFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.example.model.users.User;

public class FunctionsAdmin extends AccountGenerics<User> {
    List<User> list = new ArrayList<User>();

    @Override
    public List<User> searchAccounts(User criteria) {
        System.out.println("Searching user in system...");

        return list.stream()
            .filter(t -> {
                // 1. Se o critério tem ID, compara IDs
                if (criteria.getId() != null) {
                    System.out.println("User found " + t);
                    return criteria.getId().equals(t.getId());
                }
                // 2. Se não tem ID mas tem Email, compara Emails
                if (criteria.getEmail() != null) {
                    System.out.println("E-mail not found!");
                    return criteria.getEmail().equalsIgnoreCase(t.getEmail());
                }
                // 3. Se o objeto de critério estiver vazio, não filtra nada
                return false;
            })
            .collect(Collectors.toList());
    
}

}
