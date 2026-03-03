package com.gla.SmartDeviceControlInterface.Smart_Vehicle_Dashboard;

public class PetrolCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }

    // No battery method → uses default
}
