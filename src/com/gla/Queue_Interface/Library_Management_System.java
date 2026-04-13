package com.gla.Queue_Interface;

import java.util.*;

class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnedStack = new Stack<>();

        books.add(new Book("Java"));
        books.add(new Book("DSA"));
        books.add(new Book("OS"));

        members.add("M1");
        members.add("M2");
        members.add("M1");

        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.remove();
            System.out.println("Issued: " + b);

            returnedStack.push(b);
        }

        if (!returnedStack.isEmpty()) {
            Book b = returnedStack.pop();
            System.out.println("Re-issued: " + b);
        }

        System.out.println("All books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}