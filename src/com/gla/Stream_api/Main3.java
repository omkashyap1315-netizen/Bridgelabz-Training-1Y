package com.gla.Stream_api;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class Main3 {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 1000),
                new Claim("Vehicle", 2000),
                new Claim("Health", 1500)
        );

        Map<String, Double> result = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        System.out.println(result);
    }
}
