package com.company;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
public class ArrayList{
    int IndexOfList = 10;
    Integer[] arrayList = new Integer[IndexOfList];
    public void get(int index) {
        System.out.println(arrayList[index]);
    }
    public void add(int num, int index) {
        if (arrayList[index] != null) {
            System.out.println("index is invalid");
            System.exit(0);
        }
//        if (arrayList[arrayList.length - 1] != null) {
//            Integer[]arrayLists = Arrays.copyOf(arrayList, 100);
//            arrayLists[index] = num;
//            System.out.println(arrayLists[index]);
//        }
        arrayList[index] = num;
        System.out.println(arrayList[index]);

    }
    public void size() {
        System.out.println(IndexOfList);
    }
    public void remove(int index) {
        arrayList[index] = null;
        System.out.println(arrayList[index]);
    }
    public void clear() {
        for (int i = 0; i <arrayList.length - 1 ; i++) {
            arrayList[i] = null;
            System.out.println(arrayList[i]);
        }
    }
    public void set(int index, int num) {
        arrayList[index] = num;
        System.out.println(arrayList[index]);
    }

}

