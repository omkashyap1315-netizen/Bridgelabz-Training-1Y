package com.gla.Java_Packages.Library.Books;

public class Books {
    private String title;
    private String author;
    private String isbn;

    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public String getTitle() {
        return title;
    }
}
