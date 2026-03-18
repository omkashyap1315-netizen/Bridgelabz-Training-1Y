package com.gla;

public class Book_ {

    protected int bookId;
    protected String title;
    protected double price;

    // Static variable shared across all books
    public static String libraryName = "City Central Library";

    // Constructor
    public Book_(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to calculate fine (default behavior)
    public double calculateFine(int daysLate) {
        return 0;  // Base class default
    }

    public void displayDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}
