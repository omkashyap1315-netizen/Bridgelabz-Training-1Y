package com.gla.Ride_HailingApplication;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName,
                   double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = location;
    }

    // Encapsulation (only getters)
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setCurrentLocation(String location) {
        this.currentLocation = location;
    }

    protected String getCurrentLocationInternal() {
        return currentLocation;
    }

    // Concrete method
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId +
                ", Driver: " + driverName +
                ", Rate/km: ₹" + ratePerKm;
    }

    // Abstract method
    public abstract double calculateFare(double distance);
}
