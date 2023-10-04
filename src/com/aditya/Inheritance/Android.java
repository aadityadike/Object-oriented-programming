package com.aditya.Inheritance;

public class Android extends SmartPhone{
    String processor;

    public Android(String processor) {
        this.processor = processor;
    }

    public Android(String ringtone,String os, String camera, int battery, boolean cableType, String processor) {
        super(ringtone,os, camera, battery, cableType);
        this.processor = processor;
    }
}
