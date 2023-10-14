package com.aditya.AbstractDemo;

public class Child2 extends Parent {

    Child2(int age) {
        super(age);
    }

    @Override
    void eyes() {
        System.out.println("blue");
    }
}
