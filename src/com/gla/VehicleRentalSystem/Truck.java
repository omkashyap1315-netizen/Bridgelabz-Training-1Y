package com.gla.VehicleRentalSystem;

public class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 1000 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy Active";
    }
}
