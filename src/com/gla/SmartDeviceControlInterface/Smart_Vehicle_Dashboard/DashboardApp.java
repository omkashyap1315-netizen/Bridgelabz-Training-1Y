package com.gla.SmartDeviceControlInterface.Smart_Vehicle_Dashboard;

public class DashboardApp {

    public static void main(String[] args) {

        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed(80);
        petrol.displayBatteryStatus(0); // Uses default

        electric.displaySpeed(100);
        electric.displayBatteryStatus(75); // Uses overridden method
    }
}
