package org.example.service.genericsFunctions;


import java.util.ArrayList;
import java.util.List;

public class AccountGenerics<T>  {
    private List<T> list;


    public AccountGenerics(){
        this.list = new ArrayList<>();
    }

    public void addAccount(T account) {
            list.add(account);
    }

    public List<T> searchAccounts(T item) {
           return null;
    }

    public void removeAccount(T account) {
            list.remove(account);
    }

    


}
