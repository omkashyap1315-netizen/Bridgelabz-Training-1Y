package com.gla.SmartDeviceControlInterface.Cloning_Prototype_Objects;

public class PrototypeApp {

    public static void main(String[] args) {

        try {
            Vehicle original = new Vehicle("Tesla Model 3", 45000);

            Vehicle cloned = (Vehicle) original.clone();

            original.display();
            cloned.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
