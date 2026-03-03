package com.gla.E_CommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Jacket", 3000));
        products.add(new Groceries(3, "Rice", 1000));

        printFinalPrices(products);
    }

    public static void printFinalPrices(List<Product> products) {

        for (Product p : products) {

            double price = p.getPrice();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            }

            double finalPrice = price + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("Base Price: " + price);
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------");
        }
    }
}
