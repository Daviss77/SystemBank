package org.example.service.genericsFunctions;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.example.model.users.User;

public class FunctionsAdmin extends AccountGenerics<User> {
    List<User> list = new ArrayList<User>();


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

}


