package com.gla.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR123", 2000, "CAR-INS-001"));
        vehicles.add(new Bike("BIKE456", 800, "BIKE-INS-002"));
        vehicles.add(new Truck("TRK789", 5000, "TRK-INS-003"));

        int days = 3;

        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                Insurable insurable = (Insurable) v;
                insuranceCost = insurable.calculateInsurance(days);
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println("-----------------------------------");
        }
    }
}
