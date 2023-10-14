package com.aditya.Interfaces.Important;

public class BrandNewCar {
    private Engine engine;

    public BrandNewCar() {
        this.engine = new OldEngine();
    }

    public BrandNewCar(Engine engine) {
        this.engine = engine;
    }

    public void StartTheCar() {
        engine.start();
    }

    public void StopTheCar() {
        engine.stop();
    }
}
