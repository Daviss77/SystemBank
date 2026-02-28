package org.example.service.genericsFunctions;


import java.util.ArrayList;
import java.util.List;

import org.example.model.users.User;

public class ServiceCrudGenerics<T extends User>  {
    private List<User> list;


    public ServiceCrudGenerics(){
        this.list = new ArrayList<>();
    }

    public void addAccount(T account) {
            list.add(account);
    }

    public List<T> searchAccounts(T account) {
           return null;
    }

    public void removeAccount(T account) {
            list.remove(account);
    }

    


}
