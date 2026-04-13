package com.gla.Generics_Problems;

import java.util.*;

class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Truck extends Vehicle {
    Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }
}

class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T v : fleet) {
            System.out.println(v);
        }
    }
}

public class Main11 {
    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Tata Truck"));
        truckFleet.addVehicle(new Truck("Ashok Leyland"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Royal Enfield"));
        bikeFleet.addVehicle(new Bike("Yamaha"));

        truckFleet.showFleet();
        System.out.println();
        bikeFleet.showFleet();
    }
}
