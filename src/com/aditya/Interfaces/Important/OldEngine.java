package com.aditya.Interfaces.Important;

public class OldEngine implements Engine {
    @Override
    public void start(){
        System.out.println("OldEngine Started");
    }

    @Override
    public void stop(){
        System.out.println("OldEngine Stopped");
    }
}
