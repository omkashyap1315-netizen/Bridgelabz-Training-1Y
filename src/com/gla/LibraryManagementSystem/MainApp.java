package com.gla.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Programming", "James Gosling"));
        items.add(new Magazine("M202", "Tech Today", "Editorial Team"));
        items.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {

            System.out.println(item.getItemDetails());

            // Polymorphic call
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Interface usage
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;

                if (reservable.checkAvailability()) {
                    reservable.reserveItem("Rahul");
                }
            }

            System.out.println("-----------------------------------");
        }
    }
}
