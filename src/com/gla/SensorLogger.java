package com.gla;

import java.util.*;

public class SensorLogger {

    public static void logTemperature(Double temp){
        System.out.println("Temperature: " + temp);
    }

    public static void main(String[] args) {

        double t1 = 25.5;
        Double t2 = 30.2;

        logTemperature(t1); // auto boxing
        logTemperature(t2);

        double read = t2; // auto unboxing
        System.out.println("Read value: " + read);
    }
}
