package com.aditya.Interfaces.Important;

public class ElectricalEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electrical Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electrical Engine Stopped");
    }

}
