package com.accountType;

public class saving extends accounts {
    public saving(String name, String username, String password) {
        super(name, username, password,10000,50000);
    }

    @Override
    public void deposit(double amount) {
        // Implementation for depositing money into saving account
        if(amount > 0){
            if(this.isActive){
                System.out.println("active hai?");
                if(amount + this.balance <= balance_limit){
                    this.balance += amount;
                    System.out.println("Deposit successful! Current balance: " + this.balance);
                } else {
                    System.out.println("Deposit failed! Balance limit exceeded.");
                }
            }
            else{
                System.out.println("Deposit for first time, minimum deposit of 2000 is required.");
                if(amount >= 2000){
                    this.balance += amount;
                    this.isActive = true;
                    System.out.println("Deposit successful! Current balance: " + this.balance);
                } else {
                    System.out.println("Deposit failed! Minimum deposit of 2000 is required to activate the account.");
                }
            }
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        // Implementation for withdrawing money from saving account
    }
    
}
