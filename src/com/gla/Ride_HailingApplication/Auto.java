package com.gla.Ride_HailingApplication;

public class Auto extends Vehicle implements GPS {

    public Auto(String vehicleId, String driverName,
                double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return 30 + (getRatePerKm() * distance);
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
