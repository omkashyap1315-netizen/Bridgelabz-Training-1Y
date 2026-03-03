package com.gla.LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            setBorrowerName(borrowerName);
            setAvailability(false);
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }
}
