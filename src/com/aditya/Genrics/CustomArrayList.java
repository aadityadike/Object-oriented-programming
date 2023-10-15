package com.aditya.Genrics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size;
    private final int DEFAULT_SIZE = 2;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (isFull()) {
            resize();
        }

        data[size++] = element;
    }

    public int remove(int index) {
        int[] newArray = new int[data.length - 1];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[index]) {
                newArray[i] = data[i];
            }
        }
        int removed = data[index];
        data = newArray;
        size--;
        return removed;
    }

    private void resize() {
        int[] temp = new int[DEFAULT_SIZE * 2];

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
        return "CustomArrayList " +
               Arrays.toString(data) +
               "\nsize=" + size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
