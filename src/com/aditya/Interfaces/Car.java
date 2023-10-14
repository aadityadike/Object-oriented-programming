package com.aditya.Interfaces;

public class Car implements Engine, Breaks, MediaPlayer {

    @Override
    public void breaks() {
        System.out.println("breaks");
    }

    @Override
    public void name() {
        System.out.println("tesla");
    }

    @Override
    public void Mileage() {
        System.out.println("3000");
    }

    @Override
    public void acc() {
        System.out.println("accelerator");
    }

    @Override
    public void turnON() {
        System.out.println("turned ON");
    }

    @Override
    public void turnOFF() {
        System.out.println("turned OFF");
    }
}
