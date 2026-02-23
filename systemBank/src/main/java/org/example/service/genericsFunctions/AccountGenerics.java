package org.example.service.genericsFunctions;

import org.example.model.users.User;

import java.util.ArrayList;
import java.util.List;

public class AccountGenerics<T>  {
    List<T> list = new ArrayList<T>();


    public void addAccount(T account) {
            list.add(account);
    }

    public List<T> searchAccounts(T account) {
            return list;
    }

    public void removeAccount(T account) {
            list.remove(account);
    }

}
