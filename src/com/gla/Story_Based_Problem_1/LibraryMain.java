package com.gla.Story_Based_Problem_1;
class Book {

    int bookId;
    String title;
    double price;

    static String libraryName = "GLA Central Library";

    // Constructor
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    double calculateFine(int daysLate) {
        return 0;
    }

    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class TextBook extends Book {

    TextBook(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 2;
    }
}

class Magazine extends Book {

    Magazine(int id, String title, double price) {
        super(id, title, price);
    }

    double calculateFine(int daysLate) {
        return daysLate * 5;
    }
}

public class LibraryMain {

    public static void main(String[] args) {

        Book b1 = new TextBook(101, "Java Programming", 500);
        Book b2 = new Magazine(201, "Tech Today", 200);

        b1.display();
        System.out.println("Fine: " + b1.calculateFine(3));

        System.out.println();

        b2.display();
        System.out.println("Fine: " + b2.calculateFine(3));
    }
}
