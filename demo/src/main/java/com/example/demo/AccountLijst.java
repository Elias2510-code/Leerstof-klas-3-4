package com.example.demo;

import java.util.ArrayList;

public class AccountLijst {
    ArrayList<Account> accounts = new ArrayList<>();
    public AccountLijst() {
        this.accounts = new ArrayList<Account>();
        accounts.add (new Account("test", "testpass"));
    }
    public boolean ControleAccount(Account account) {

    }
}
