package com.aditya.Genrics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {

    /*
     All the objects are created at runtime, the reference type is actually specified,
     i.e. <Integer> but the object wil get created at runtime, and since at
     compile time we don't know the type of we cannot use the generics.
    */


    private Object[] data;
    private int size;
    private final int DEFAULT_SIZE = 2;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T element) {
        if (isFull()) {
            resize();
        }

        data[size++] = element;
    }

    public T remove(int index) {
        Object[] newArray = new Object[data.length - 1];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[index]) {
                newArray[i] = data[i];
            }
        }

        T removed = (T) data[index];
        data = newArray;
        size--;
        return removed;
    }

    private void resize() {
        Object[] temp = new Object[DEFAULT_SIZE * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return data.length == size;
    }

    @Override
    public String toString() {
        return "CustomArrayList " + Arrays.toString(data) + "\nsize=" + size;
    }

    public static void main(String[] args) {
        CustomGenericArrayList<String> list = new CustomGenericArrayList<>();
        list.add("ldf");
        list.add("fld");
        list.add("lsd");
        list.add("flaks");
        System.out.println(list);
        String removed = list.remove(3);
        System.out.println(list);
        System.out.println(removed);
    }
}
