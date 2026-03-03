package com.gla.VehicleRentalSystem;

public class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 500 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy Active";
    }
}
