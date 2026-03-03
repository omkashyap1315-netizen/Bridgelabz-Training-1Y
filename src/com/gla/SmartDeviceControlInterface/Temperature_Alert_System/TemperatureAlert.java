package com.gla.SmartDeviceControlInterface.Temperature_Alert_System;

import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        double currentTemperature = 38.5;
        double threshold = 35.0;

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHot = temp -> temp > threshold;

        if (isHot.test(currentTemperature)) {
            System.out.println("⚠ ALERT! Temperature is too high!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
