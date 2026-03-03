package com.gla.VehicleRentalSystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    protected void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);
}
