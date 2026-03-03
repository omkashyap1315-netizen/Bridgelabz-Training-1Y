package com.gla.Ride_HailingApplication;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C101", "Rahul", 15, "Delhi"));
        vehicles.add(new Bike("B202", "Amit", 10, "Noida"));
        vehicles.add(new Auto("A303", "Suresh", 12, "Gurgaon"));

        double distance = 10; // km

        calculateFares(vehicles, distance);
    }

    public static void calculateFares(List<Vehicle> vehicles, double distance) {

        for (Vehicle vehicle : vehicles) {

            System.out.println(vehicle.getVehicleDetails());

            // Polymorphic call
            double fare = vehicle.calculateFare(distance);

            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: ₹" + fare);

            // GPS usage
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Updated City");
                System.out.println("New Location: " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------------------");
        }
    }
}
