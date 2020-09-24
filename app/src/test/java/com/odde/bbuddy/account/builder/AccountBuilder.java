package com.odde.bbuddy.account.builder;

public class AccountBuilder {

    public static AccountBuilder2 anAccount() {
        return new AccountBuilder2().setId(1).setName("name").setBalanceBroughtForward(100);
    }

    public static AccountBuilder2 emptyAccount() {
        return new AccountBuilder2();
    }
}
