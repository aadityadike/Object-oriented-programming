package com.aditya.Static;

public class StaticBlocks {
    static int a = 9;
    static int b;

    static {
        // This block is only running once.
        System.out.println("I am static block");
        a = 10;
        b = a * a;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
