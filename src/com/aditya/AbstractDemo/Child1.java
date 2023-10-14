package com.aditya.AbstractDemo;

public class Child1 extends Parent {
    @Override
    void eyes() {
        System.out.println("Brown");
    }

    public Child1(int age){
        super(age);
    }

    static void ears() {
        System.out.println("I cannot hear with my ears");
    }

}
