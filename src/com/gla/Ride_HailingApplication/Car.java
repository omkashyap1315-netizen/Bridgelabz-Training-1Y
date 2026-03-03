package com.gla.Ride_HailingApplication;

public class Car extends Vehicle implements GPS {

    public Car(String vehicleId, String driverName,
               double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return 50 + (getRatePerKm() * distance);
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}
