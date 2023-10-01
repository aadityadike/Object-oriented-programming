package com.aditya.classes;

public class StaticKeyWord {
    public static void main(String[] args) {
        Humans obj = new Humans("aditya", 20, false);
        Humans obj2 = new Humans("sahil", 21, false);
        System.out.println(Humans.population);
        System.out.println(Humans.population);
    }

    static void example() {
        // cannot run non-static method inside static method, because it requires object.
        /*
             greeting();
        */
        // if I create one object it will work.
        StaticKeyWord obj = new StaticKeyWord();
        obj.greeting();
    }

    void greeting() {
        // I can run not-static and static methods inside non-static methods.
        example();
        notMe();
    }

    void notMe() {
        System.out.println("NOT ME");
    }

}

class Humans {
    String name;
    int age;
    boolean isMarried;
    static long population;

    public Humans(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        population += 1;
    }
}

