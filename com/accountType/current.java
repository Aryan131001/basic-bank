package com.accountType;

public class current extends accounts {
    public current(String name, String username, String password) {
        super(name, username, password,20000,100000);
    }

    @Override
    public void deposit(double amount) {
        // Implementation for depositing money into current account
        if(amount>0){
            if(this.isActive){
                if(this.balance + amount <= balance_limit){
                    this.balance += amount;
                }
                else{
                    System.out.println("Your alance cannot be greater than ytour limit");
                }
            }
            else{
                this.isActive=true;
                if(amount<2000){
                    System.out.println("Minimum balance to maintain is 2000");
                }
                else{
                    if(this.balance + amount <= balance_limit){
                    this.balance += amount;
                }
                else{
                    System.out.println("Your alance cannot be greater than ytour limit");
                }
                }
            }
        }
        else{
            System.out.println("Amount should be more than 0");
        }
    }

    @Override
    public void withdraw(double amount) {
        // Implementation for withdrawing money from current account
        if(amount>0 && amount<=(withdraw_limit-2000)){
            this.balance -= amount;
        }
        else{
            System.out.println("Amount should be greater than 0 and in your limit");
        }
    }
}