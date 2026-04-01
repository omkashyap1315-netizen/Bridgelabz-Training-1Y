package com.gla;

public class bank {

    public static double remainingLimit(Double limit, double used){

        if(limit == null){
            return 0.0;
        }

        return limit - used;
    }

    public static void main(String[] args) {

        Double limit = 5000.0;
        double used = 2000.0;

        System.out.println("Remaining Limit: " + remainingLimit(limit, used));
    }
}
