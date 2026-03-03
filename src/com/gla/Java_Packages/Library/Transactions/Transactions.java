package com.gla.Java_Packages.Library.Transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        System.out.println("Issuing Book...");
        System.out.println("Book: " + book.getTitle());
        System.out.println("Issued To: " + member.getName());
        System.out.println("Status: Successfully Issued");
    }
}