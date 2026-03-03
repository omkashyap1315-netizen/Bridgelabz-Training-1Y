package com.gla.LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
            setAvailability(false);
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
