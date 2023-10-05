package com.aditya.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Square();
        shape.area();
    }
}

/*
* Overloading happens in one class, means methods can have different return types and parameters.
* Overriding means having the same method in child class as parent class.
* */





/*
 * Two Types of Polymorphism:
 * Runtime polymorphism: Which method needs to call is decided at runtime.
 * E.g., you have superclass as a reference type and object of child class it will check does superclass & child have the method that you want to call,
 * and then it will call the child class constructor.
 *
 * Compile time polymorphism: Which method needs to call is decided at compile time.
 * E.g., you have the same method name but different parameters or return type.
 */


