package com.gla.Queue_Interface;

import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return name + " " + price + " " + stock;
    }
}

public class Inventory_and_Restock_Management_System {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();

        List<Product> products = new ArrayList<>();

        Queue<Product> restockQueue = new LinkedList<>();

        Stack<Product> restockStack = new Stack<>();

        if (productNames.add("Milk")) {
            products.add(new Product("Milk", 50, 2));
        }

        if (productNames.add("Bread")) {
            products.add(new Product("Bread", 30, 10));
        }

        if (productNames.add("Eggs")) {
            products.add(new Product("Eggs", 60, 1));
        }

        if (productNames.add("Milk")) {
            products.add(new Product("Milk", 50, 5));
        }

        int threshold = 3;

        for (Product p : products) {
            if (p.stock < threshold) {
                restockQueue.add(p);
            }
        }

        System.out.println("Restocking:");

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.remove();
            p.stock += 10;
            System.out.println("Restocked: " + p);

            restockStack.push(p);
        }

        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            last.stock -= 10;
            System.out.println("Undo restock: " + last);
        }

        System.out.println("Final products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
