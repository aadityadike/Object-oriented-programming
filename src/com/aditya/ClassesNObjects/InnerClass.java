package com.aditya.ClassesNObjects;

/*
class A {
    static String name;

    public void hello() {
        System.out.println("hey!");
    }

    public A(String name) {
        A.name = name;
    }
}
*/
public class InnerClass {
    static class A {
        String name;

        public void hello() {
            System.out.println("hey!");
        }

        public A(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        A obj = new A("Aditya");
        A obj1 = new A("Siddhesh");

        System.out.println(obj1.name);
        System.out.println(obj.name);
    }
}
