package com.gla.Using_Objects_and_Classes.Level2;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 1, 85);
        s1.displayDetails();
        System.out.println();

        BankAccount b1 = new BankAccount("Amit", 1001, 5000);
        b1.deposit(2000);
        b1.withdraw(3000);
        b1.displayBalance();
        System.out.println();

        PalindromeChecker p1 = new PalindromeChecker("Madam");
        p1.displayResult();
        System.out.println();

        MovieTicket t1 = new MovieTicket("Avengers");
        t1.bookTicket("A10", 250);
        t1.displayDetails();
        System.out.println();

        CartItem c1 = new CartItem("Laptop", 50000);
        c1.addItem(2);
        c1.removeItem(1);
        c1.displayTotalCost();
    }
}


