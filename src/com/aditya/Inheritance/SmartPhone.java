package com.aditya.Inheritance;

public class SmartPhone extends Phone{
    String os;
    String camera;
    int battery;
    // here false means micro usb & true means type C.
    boolean cableType;

    public SmartPhone() {

    }

    public SmartPhone(String ringtone, String os, String camera, int battery, boolean cableType) {
//        super(); default it will get called not matter, you assign or not.
        super(ringtone);
        this.os = os;
        this.camera = camera;
        this.battery = battery;
        this.cableType = cableType;
    }

    public SmartPhone(String os, String camera, int battery, boolean cableType) {
        this.os = os;
        this.camera = camera;
        this.battery = battery;
        this.cableType = cableType;
    }
}


