package com.gla.Queue_Interface;

import java.util.*;

class Package {
    String id;
    String name;

    Package(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Warehouse_Delivery_Tracking_System {
    public static void main(String[] args) {
        Queue<Package> queue = new LinkedList<>();
        Set<String> ids = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();

        Package p1 = new Package("P1", "Item1");
        Package p2 = new Package("P2", "Item2");
        Package p3 = new Package("P3", "Item3");
        Package p4 = new Package("P2", "Duplicate");

        if (ids.add(p1.id)) queue.add(p1);
        if (ids.add(p2.id)) queue.add(p2);
        if (ids.add(p3.id)) queue.add(p3);
        if (ids.add(p4.id)) queue.add(p4);

        while (!queue.isEmpty()) {
            Package p = queue.remove();

            if (p.id.equals("P2")) {
                System.out.println("Returned: " + p);
                returned.push(p);
            } else {
                System.out.println("Delivered: " + p);
                delivered.add(p);
            }
        }

        System.out.println("\nDelivered packages:");
        for (Package p : delivered) {
            System.out.println(p);
        }

        System.out.println("\nReturned packages:");
        for (Package p : returned) {
            System.out.println(p);
        }
    }
}
