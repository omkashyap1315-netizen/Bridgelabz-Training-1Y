package com.gla;

public class LibraryApp {

    public static void main(String[] args) {

        Book_ book1 = new TextBook(101, "Java Programming", 500);
        Book_ book2 = new Magazine(202, "Tech Monthly", 150);

        book1.displayDetails();
        System.out.println("Fine (5 days late): ₹" + book1.calculateFine(5));

        System.out.println("--------------------");

        book2.displayDetails();
        System.out.println("Fine (5 days late): ₹" + book2.calculateFine(5));
    }
}
