package com.aditya.polymorphism;

public class Square extends Shapes {

    // Runtime Polymorphism
    @Override
    void area() {
        System.out.println("Hey, I am square Class!");
    }

    // Compile time polymorphism
    void area(String s) {
        System.out.println("Hey, I am square Class!");
    }
}
