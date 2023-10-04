package com.aditya.Inheritance;

public class Iphone extends SmartPhone {
    String browser;

    public Iphone() {
        this.browser = "Safari";
    }

    public Iphone(String browser) {
        this.browser = browser;
    }

    public Iphone(String os, String camera, int battery, boolean cableType, String browser) {
        super(os, camera, battery, cableType);
        this.browser = browser;
    }

    public Iphone(Iphone phone) {
        this.os = phone.os;
        this.battery = phone.battery;
        this.camera = phone.camera;
        this.browser = phone.browser;
        this.cableType = phone.cableType;
    }
}
