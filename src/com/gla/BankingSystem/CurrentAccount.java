package com.gla.BankingSystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Requested: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 100000;
    }
}
