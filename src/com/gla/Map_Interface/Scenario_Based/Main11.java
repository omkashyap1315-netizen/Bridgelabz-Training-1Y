package com.gla.Map_Interface.Scenario_Based;

import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

        map.put("ACC1", 5000.0);
        map.put("ACC2", 8000.0);
        map.put("ACC3", 3000.0);
        map.put("ACC4", 10000.0);
        map.put("ACC5", 7000.0);

        String accDeposit = "ACC1";
        map.put(accDeposit, map.get(accDeposit) + 2000);

        String accWithdraw = "ACC3";
        double withdrawAmount = 4000;

        if (map.containsKey(accWithdraw)) {
            double balance = map.get(accWithdraw);
            if (balance >= withdrawAmount) {
                map.put(accWithdraw, balance - withdrawAmount);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        List<Map.Entry<String, Double>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, (a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("All customers sorted by balance:");
        for (Map.Entry<String, Double> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        System.out.println("Top 3 customers:");
        for (int i = 0; i < 3 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}
