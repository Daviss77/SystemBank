package org.example.service.genericsFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.example.model.users.User;

public class ServiceGeneSearchAccount extends ServiceCrudGenerics<User> {
    private static List<User> list = new ArrayList<User>();


        public Optional<User> findByID(Integer id) {
            return list.stream()
                    .filter(u -> u.getId().equals(id))
                    .findFirst();
        }

        public Optional<User> findByEmail(String email) {
            return list.stream()
                    .filter(u -> u.getEmail().equalsIgnoreCase(email))
                    .findFirst();
        }

        public void save(User user) {
            list.add(user);
        }

}


