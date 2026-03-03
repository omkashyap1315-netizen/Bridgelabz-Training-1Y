package com.gla.BankingSystem;

public abstract class BankAccount {

    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters (Encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Controlled balance update
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Concrete Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Abstract Method
    public abstract double calculateInterest();
}