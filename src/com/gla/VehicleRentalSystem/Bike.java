package com.gla.VehicleRentalSystem;

public class Bike extends Vehicle implements Insurable {

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 200 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy Active";
    }
}
