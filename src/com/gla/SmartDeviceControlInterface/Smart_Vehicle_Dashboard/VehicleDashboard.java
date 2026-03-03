package com.gla.SmartDeviceControlInterface.Smart_Vehicle_Dashboard;

// VehicleDashboard.java
public interface VehicleDashboard {

    void displaySpeed(int speed);

    // New feature added later
    default void displayBatteryStatus(int percentage) {
        System.out.println("Battery status not available for this vehicle.");
    }
}
