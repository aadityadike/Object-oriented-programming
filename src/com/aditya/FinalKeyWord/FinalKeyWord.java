package com.aditya.FinalKeyWord;

public class FinalKeyWord {
    public static void main(String[] args) {
        // FinalKeyWord simply means the value of primitive variable cannot be changed.
        final int cals = 10;
        // This will not work because cals is now final (Constant).
        // cals = 12;

        final Some something = new Some("SomeOne");
        System.out.println(something.name);
        // cannot change the object because the object is finalized. 🔒
        // I can change the value of the object because the variable is pointing to reference of the object.🗾
        // So we cannot change the reference, we cannot point to different object,🐷
        // but we can change the value because the objects reference will remain the same even when we change the value.🦝
        // something = new Some("anything");
    }

    static class Some {
        String name = "aditya";

        public Some(String name) {
            this.name = name;
        }
    }

}


