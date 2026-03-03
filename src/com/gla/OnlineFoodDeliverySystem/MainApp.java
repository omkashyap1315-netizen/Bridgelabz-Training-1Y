package com.gla.OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 300, 3));

        processOrder(order);
    }

    public static void processOrder(List<FoodItem> order) {

        double grandTotal = 0;

        for (FoodItem item : order) {

            System.out.println(item.getItemDetails());

            double totalPrice = item.calculateTotalPrice();  // Polymorphism
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount(totalPrice);
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");

            grandTotal += finalPrice;
        }

        System.out.println("Grand Total Bill: " + grandTotal);
    }
}
