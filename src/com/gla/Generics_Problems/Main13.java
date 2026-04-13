package com.gla.Generics_Problems;

import java.util.*;

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return name + " | " + price + " | " + category;
    }
}

class BookCategory {
    String type;

    BookCategory(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

class ClothingCategory {
    String type;

    ClothingCategory(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

class GadgetCategory {
    String type;

    GadgetCategory(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}

class Main13 {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double price = product.getPrice();
        price = price - (price * percentage / 100);
        product.setPrice(price);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory("Programming"));
        Product<ClothingCategory> cloth = new Product<>("T-Shirt", 1000, new ClothingCategory("Fashion"));
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 20000, new GadgetCategory("Electronics"));

        System.out.println("Before Discount:");
        System.out.println(book);
        System.out.println(cloth);
        System.out.println(gadget);

        applyDiscount(book, 10);
        applyDiscount(cloth, 20);
        applyDiscount(gadget, 5);

        System.out.println("\nAfter Discount:");
        System.out.println(book);
        System.out.println(cloth);
        System.out.println(gadget);
    }
}