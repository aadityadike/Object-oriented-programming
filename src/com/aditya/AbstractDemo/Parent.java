package com.aditya.AbstractDemo;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void ears() {
        System.out.println("I can hear with my ears");
    }

    abstract void eyes();
}
