package com.gla.LibraryManagementSystem;
public abstract class LibraryItem {

    private String itemId;
    private String title;
    private String author;

    // Encapsulated borrower data
    private String borrowerName;
    private boolean isAvailable = true;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (Encapsulation)
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    protected void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Concrete method
    public String getItemDetails() {
        return "ID: " + itemId +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + isAvailable;
    }

    // Abstract method
    public abstract int getLoanDuration();  // in days
}
