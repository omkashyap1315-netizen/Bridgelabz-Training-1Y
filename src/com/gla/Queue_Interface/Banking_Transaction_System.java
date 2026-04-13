package com.gla.Queue_Interface;

import java.util.*;

class Transaction {
    String accountId;
    double amount;

    Transaction(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String toString() {
        return accountId + " " + amount;
    }
}

class Account {
    String id;

    Account(String id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account a = (Account) o;
        return this.id.equals(a.id);
    }

    public int hashCode() {
        return id.hashCode();
    }
}

public class Banking_Transaction_System {
    public static void main(String[] args) {
        List<Transaction> history = new ArrayList<>();

        Queue<Transaction> queue = new LinkedList<>();
        queue.add(new Transaction("A1", 1000));
        queue.add(new Transaction("A2", 2000));
        queue.add(new Transaction("A3", 1500));

        Set<Account> accounts = new HashSet<>();
        accounts.add(new Account("A1"));
        accounts.add(new Account("A2"));

        Stack<Transaction> stack = new Stack<>();

        while (!queue.isEmpty()) {
            Transaction t = queue.remove();

            if (accounts.contains(new Account(t.accountId))) {
                System.out.println("Processed: " + t);
                history.add(t);
                stack.push(t);
            } else {
                System.out.println("Invalid account: " + t.accountId);
            }
        }

        if (!stack.isEmpty()) {
            Transaction last = stack.pop();
            history.remove(last);
            System.out.println("Rolled back: " + last);
        }

        System.out.println("Final transactions:");
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}
