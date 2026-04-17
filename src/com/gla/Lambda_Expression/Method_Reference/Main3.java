package com.gla.Lambda_Expression.Method_Reference;

import java.util.*;
import java.util.stream.*;

class Invoice {
    String id;

    Invoice(String id) {
        this.id = id;
    }

    public String toString() {
        return id;
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("I1", "I2", "I3");

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
