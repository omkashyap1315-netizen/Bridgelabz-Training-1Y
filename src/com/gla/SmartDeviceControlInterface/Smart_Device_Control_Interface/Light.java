package com.gla.SmartDeviceControlInterface.Smart_Device_Control_Interface;

public class Light implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is turned OFF.");
    }
}
