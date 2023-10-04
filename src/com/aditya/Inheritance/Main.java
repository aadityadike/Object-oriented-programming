package com.aditya.Inheritance;

public class Main {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone("chromium");
        Iphone phone2 = new Iphone(phone1);
        System.out.println(phone1.browser);
        System.out.println(phone2.os);
    }
}
