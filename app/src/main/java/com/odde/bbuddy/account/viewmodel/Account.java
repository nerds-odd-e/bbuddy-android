package com.odde.bbuddy.account.viewmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Account implements Serializable {

    private String name;
    @JsonProperty("balance")
    private int balanceBroughtForward;
    private int id;

    public Account(String name, int balanceBroughtForward, int id) {
        this.name = name;
        this.balanceBroughtForward = balanceBroughtForward;
        this.id = id;
    }

    public Account() {
    }

    public String getName() {
        return name;
    }

    public int getBalanceBroughtForward() {
        return balanceBroughtForward;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalanceBroughtForward(int balanceBroughtForward) {
        this.balanceBroughtForward = balanceBroughtForward;
    }

    public void setId(int id) {
        this.id = id;
    }
}
