package com.gla;

public class Magazine extends Book_ {

    public Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    public double calculateFine(int daysLate) {
        return daysLate * 5;   // ₹5 per day
    }
}
