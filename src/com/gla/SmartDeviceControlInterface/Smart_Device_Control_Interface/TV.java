package com.gla.SmartDeviceControlInterface.Smart_Device_Control_Interface;

public class TV implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
