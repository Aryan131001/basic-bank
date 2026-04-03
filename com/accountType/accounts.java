package com.accountType;

public abstract class accounts {
    public String username;
    public String password;
    public String name;
    public int balance_limit;
    public int withdraw_limit;
    public int min_balance;
    public boolean isActive=false;
    public int balance;

    public accounts(String name, String username, String password,int withdraw_limit, int balance_limit) {
        this.name = name;
        this.withdraw_limit = withdraw_limit;
        this.balance_limit = balance_limit;
        this.username = username;
        this.password = password;
        this.balance = 0;
        this.isActive = false;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
