package com.example.quizit;

public class User {
    private String email, name, pass, refCode;
    private long coins=25;

    public User(String email, String name, String pass, String refCode) {
        this.email = email;
        this.name = name;
        this.pass = pass;
        this.refCode = refCode;
    }

    public User() {
    }

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }
}
