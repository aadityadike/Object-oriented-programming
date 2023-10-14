package com.aditya.Interfaces.Important;

public class NewEngine implements Engine {
    @Override
    public void start() {
        System.out.println("New Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("New Engine Stopped");
    }
}
