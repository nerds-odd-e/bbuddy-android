package com.odde.bbuddy.account.builder;

import com.odde.bbuddy.account.viewmodel.Account;

public class AccountBuilder2 {
    private String name;
    private int balanceBroughtForward;
    private int id;

    public AccountBuilder2 setName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder2 setBalanceBroughtForward(int balanceBroughtForward) {
        this.balanceBroughtForward = balanceBroughtForward;
        return this;
    }

    public AccountBuilder2 setId(int id) {
        this.id = id;
        return this;
    }

    public Account createAccount() {
        return new Account(name, balanceBroughtForward, id);
    }
}