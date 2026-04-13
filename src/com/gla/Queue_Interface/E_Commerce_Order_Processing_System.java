package com.gla.Queue_Interface;

import java.util.*;

class Order {
    int id;
    String name;

    Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return this.id == order.id;
    }

    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class E_Commerce_Order_Processing_System {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();

        list.add(new Order(1, "Phone"));
        list.add(new Order(2, "Laptop"));
        list.add(new Order(1, "Phone Duplicate"));
        list.add(new Order(3, "Tablet"));
        list.add(new Order(2, "Laptop Duplicate"));

        Set<Order> set = new HashSet<>(list);

        Queue<Order> queue = new LinkedList<>(set);

        Stack<Order> stack = new Stack<>();

        System.out.println("Processing orders:");

        while (!queue.isEmpty()) {
            Order o = queue.remove();
            System.out.println("Processing: " + o);

            if (o.id == 2) {
                System.out.println("Failed: " + o);
                stack.push(o);
            }
        }

        System.out.println("Retry failed orders:");

        while (!stack.isEmpty()) {
            Order o = stack.pop();
            System.out.println("Reprocessing: " + o);
        }
    }
}
