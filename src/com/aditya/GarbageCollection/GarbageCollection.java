package com.aditya.GarbageCollection;

public class GarbageCollection {
    public static void main(String[] args) {
        Aditya obj;
        for (int i = 0; i < 900000; i++) {
            obj = new Aditya();
        }
    }
}

class Aditya {
    public void hobbies() {
        System.out.println("coding");
    }

    // It gets called by garbage collector when object gets removed from the memory.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is removed");
    }
}

