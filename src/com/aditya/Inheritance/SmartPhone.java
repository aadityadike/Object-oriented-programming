package com.aditya.Inheritance;

public class SmartPhone {
    String os;
    String camera;
    int battery;
    // here false means micro usb & true means type C.
    boolean cableType;

    SmartPhone() {
        this.os = "android";
        this.camera = "sony";
        this.battery = 3000;
        this.cableType = false;
    }
}

class Iphone extends SmartPhone {
    String browser;

    public Iphone() {
        this.browser = "Safari";
    }

    public Iphone(String browser) {
        this.browser = browser;
    }
}
