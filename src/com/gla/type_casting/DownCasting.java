package com.gla.type_casting;

class Vehicle{
    void display() {
        System.out.println("Vehicle registered");
    }
}
class BMW extends Vehicle{
    void speed(){
        System.out.println("Super Car killer Speed");
    }
}

public class DownCasting {
    static void main(String[] args) {
        Vehicle v = new BMW();
        BMW b = (BMW)v;
        v.display();
        b.speed();
    }
}
