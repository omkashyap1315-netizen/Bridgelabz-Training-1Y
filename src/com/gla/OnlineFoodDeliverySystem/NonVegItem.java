package com.gla.OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (EXTRA_CHARGE * getQuantity());
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.05;   // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
