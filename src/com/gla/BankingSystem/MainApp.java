package com.gla.BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Rahul", 80000));
        accounts.add(new CurrentAccount("CA202", "Priya", 150000));

        for (BankAccount account : accounts) {

            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());

            double interest = account.calculateInterest();  // Polymorphism
            System.out.println("Calculated Interest: " + interest);

            account.deposit(5000);
            account.withdraw(3000);

            // Interface usage
            if (account instanceof Loanable) {
                Loanable loanAccount = (Loanable) account;
                loanAccount.applyForLoan(200000);

                if (loanAccount.calculateLoanEligibility()) {
                    System.out.println("Loan Approved ✅");
                } else {
                    System.out.println("Loan Rejected ❌");
                }
            }

            System.out.println("------------------------------------");
        }
    }
}
