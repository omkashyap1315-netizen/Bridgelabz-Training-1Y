package com.gla.Lambda_Expression;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " " + price + " " + rating;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product("A", 500, 4.5),
                new Product("B", 300, 4.8),
                new Product("C", 700, 4.2)
        );

        list.sort((a, b) -> Double.compare(a.price, b.price));
        list.forEach(System.out::println);

        list.sort((a, b) -> Double.compare(b.rating, a.rating));
        list.forEach(System.out::println);
    }
}
