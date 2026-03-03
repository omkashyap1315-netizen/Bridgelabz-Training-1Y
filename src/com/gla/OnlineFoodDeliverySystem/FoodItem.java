package com.gla.OnlineFoodDeliverySystem;

public abstract class FoodItem {

    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation (Getters only)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Controlled setter for quantity
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    // Concrete method
    public String getItemDetails() {
        return "Item: " + itemName +
                ", Price: " + price +
                ", Quantity: " + quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}
