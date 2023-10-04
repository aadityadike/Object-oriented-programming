package com.aditya.Inheritance;

public class Iphone extends SmartPhone {
    String browser;

    public Iphone() {
        this.browser = "Safari";
    }

    public Iphone(String os, String camera, int battery, boolean cableType, String browser) {
        super(os, camera, battery, cableType);
        this.browser = browser;
    }
}
