package anzo.custom;

import javax.swing.plaf.ViewportUI;
import java.util.Random;

public class CustomArrayList implements CustomList {

    public static String[] array;
    int size = 0;


    public CustomArrayList(int size) throws NegitiveSizeExeption {
        if (size < 0) {
            throw new NegitiveSizeExeption("size should be positive");
        }
        array = new String[size];
    }

    public CustomArrayList() throws NegitiveSizeExeption {
        this(10);
    }

    public boolean add(String element) {
        if (size == array.length) {
            createArray();
        }
        array[size] = element;
        size++;


        return true;
    }


    public void add(int index, String element) throws OutException {
        this.checkAdd(index);
        if (index >= array.length) {
            createIndexArray(index);
        }
        array[index] = element;
        size++;
        index++;


    }

    public void checkAdd(int index) throws OutException {
        if (index > this.size || index < 0) {
            throw new OutException(" index out of bounds ");
        }
    }

    public void checkRemove(int index) throws OutException {
        if (index > this.size || index < 0) {
            throw new OutException(" index out of bounds ");
        }

    }

    public void createArray() {
        String[] bigArray = new String[array.length * 2];
        System.arraycopy(array, 0, bigArray, 0, size - 1);
        array = bigArray;
    }

    public void createIndexArray(int index) {
        String[] bigArray = new String[index * 2];
        System.arraycopy(array, 0, bigArray, 0, size - 1);
        array = bigArray;
    }

    public void add(Double n, String element) {

        if (size == array.length) {
            createArray();
        }
        Random dom = new Random();
        int x = dom.nextInt(10);
        array[x] = element;
        size++;

    }


    public void remove(int index) throws OutException {
        this.checkRemove(index);
        int del = size - index - 1;
        System.arraycopy(array, index + 1, array, index, del);
        array[--size] = null;
    }

    public int size() {
        return size();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String get(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < array.length; i++) {
            s += array[i] + "\n";
        }
        return s;
    }
}
