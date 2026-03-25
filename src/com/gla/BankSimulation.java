package com.gla;

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("User1", "Premium"));
        Thread regular = new Thread(new BankAccount("User2", "Regular"));
        Thread basic = new Thread(new BankAccount("User3", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}{
}
