package com.gla.Generics_Problems;

import java.util.*;

class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    String name;

    Mobile(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return name + " - " + price;
    }
}

class Laptop extends Product {
    String name;

    Laptop(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return name + " - " + price;
    }
}

class Main10 {

    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;

        for (Product p : items) {
            total += p.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(new Mobile("Samsung", 20000));
        mobiles.add(new Mobile("iPhone", 80000));

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 50000));
        laptops.add(new Laptop("HP", 60000));

        System.out.println("Mobile Total: " + calculateTotal(mobiles));
        System.out.println("Laptop Total: " + calculateTotal(laptops));
    }
}
