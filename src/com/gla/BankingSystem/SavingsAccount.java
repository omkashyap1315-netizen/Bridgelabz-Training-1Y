package com.gla.BankingSystem;

public class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Requested: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}