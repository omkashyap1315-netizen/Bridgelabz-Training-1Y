package com.gla.SmartDeviceControlInterface.Smart_Vehicle_Dashboard;

public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryStatus(int percentage) {
        System.out.println("Battery: " + percentage + "%");
    }
}
