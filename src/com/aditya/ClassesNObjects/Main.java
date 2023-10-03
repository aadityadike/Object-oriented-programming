package com.aditya.ClassesNObjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // HUMAN IS TYPE AND 'nothing' IS REFERENCE VARIABLE HERE WE ARE DECLARING THE TYPE OF THE REFERENCE VARIABLE.🏅
        Human nothing;
        // THE NEW KEY WORD ALLOCATES MEMORY DYNAMICALLY(AT RUNTIME, NOT WHEN WE ARE COMPILING) AND HUMAN IS JUST A DEFAULT CONSTRUCTOR(FUNCTION).🏅
        nothing = new Human();

        Human aditya = new Human();
        System.out.printf("Hello 👋 My name is %s 🙈 \n", aditya.name);
        System.out.printf("%s have %s Eyes 👀\n", aditya.name, aditya.eyes);
        System.out.printf("%s have %s Fingers 🙌\n", aditya.name, aditya.fingers);

        if (!aditya.gender)
            System.out.printf("%s is Men 👨\n", aditya.name);
        else
            System.out.printf("%s is Women 👩\n", aditya.name);

        /*
          'ArrayList' is a class or datatype, doesn't matter what type of data is contained by an arraylist 🍟
          'list' is a Reference variable for that class type. 🍔
          'new' is just allocating memory at runtime 🍕
          'ArrayList<>()' is default constructor🍿
        */
        ArrayList<Integer> list = new ArrayList<>(new ArrayList<>());
    }
}

// CLASS IS OUR OWN TYPE, THAT WE HAVE CREATED TO CREATE NEW DATATYPE TO OUR CONVINCE.🍟
class Human {
    /*
     THESE ARE INSTANCE VARIABLE, BECAUSE THEY ARE INSIDE YOUR OBJECT. 💩
     YOU CAN ACCESS THESE VIA CREATING OBJECT, EVERY OBJECT WILL HAVE THESE INSTANCE VARIABLE. 🤖
    */
    int fingers = 10;
    int eyes = 2;
    String name;
    boolean gender;

    Human(){
        // This is how you call constructor from another constructor.
        this(15, "tony stark", true);
    }
    Human(int fingers, String naam, boolean gender) {
        /*
         HERE I HAVE TWO DIFFERENT VARIABLE NAMES ONE IS NAME AND ANOTHER IS NAAM.
         "name" IS THE "name" THAT I HAVE IN MY HUMAN CLASS.
        */
        name = naam;
        /*
         IN THIS CASE THE OBJECT IS ACTUALLY 'aditya' and 'this' will get replaced by 'aditya'
         WHY 'this': BECAUSE WE CANNOT SPECIFY THE OBJECT NAME DIRECTLY IF I DO 'aditya.fingers' IT WILL GIVE ME A ERROR.
         WHEN I AM SPECIFYING 'this' KEYWORD I AM TAKING ABOUT THE OBJECT THAT I HAVE,
         🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑🛑
         ERROR: aditya.fingers = fingers;
        */
        this.fingers = fingers;
        this.gender = gender;
    }
}
