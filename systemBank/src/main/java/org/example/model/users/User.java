package org.example.model.users;

import org.example.model.accountType.Account;

public class User {
    private static int increment = 1;
    private Integer id;
    private String username;
    private String email;
    private String password;
    private RoleUsers role;
    private Account account;

    public User(){
        this.id = increment ++;
    };

    public User(String username, String email, String password) {
        this.id = increment++;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleUsers getRole() {
        return role;
    }
    public void setRole(RoleUsers role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "{ " +
                "\n ID: " + id +
                "\n NAME: " + this.username +
                "\n E-MAIL: "  + this.email +
                "\n }";
    }

    
}
