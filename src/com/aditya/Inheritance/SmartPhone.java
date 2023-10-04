package com.aditya.Inheritance;

public class SmartPhone {
    String os;
    String camera;
    int battery;
    // here false means micro usb & true means type C.
    boolean cableType;

    public SmartPhone() {
    }

    public SmartPhone(String os, String camera, int battery, boolean cableType) {
        this.os = os;
        this.camera = camera;
        this.battery = battery;
        this.cableType = cableType;
    }
}


