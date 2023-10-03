package com.aditya.SingletonClass;

public class SingletonClass {
    // If you want to create only one object of the class, you can use singleton class.
    private SingletonClass() {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }

        return instance;
    }
}

class Helper {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
    }
}
