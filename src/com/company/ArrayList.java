package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<T> {
    int IndexOfList = 10;
    T[] arrayList = (T[]) new Object[IndexOfList];
    int ScoreOfSize = 0;

    public int newSize() {
        return IndexOfList *= 1.5;
    }

    void add(T el) {
        ScoreOfSize++;
        if (ScoreOfSize >= IndexOfList) {
            IndexOfList *= 1.5;
            T[] newArray = (T[]) new Object[IndexOfList];
            Arrays.copyOf(arrayList, ScoreOfSize);
            arrayList = newArray;
        }
        arrayList[ScoreOfSize] = el;
        System.out.println(arrayList[ScoreOfSize]);

    }

    public T get(int index) {
        return arrayList[index];
    }

    public int size() {
        return arrayList.length;
    }

    public void remove(int index) {
        ScoreOfSize--;
        arrayList[index] = null;
    }

    public void clear() {
        for (int i = 0; i < arrayList.length - 1; i++) {
            arrayList[i] = null;
            System.out.println(arrayList[i]);
        }
        ScoreOfSize = 0;
    }

    public T set(int index, T el) {
        if (arrayList[index] != null) {
            System.out.println("index is invalid");
            System.exit(0);
        }
        arrayList[index] = el;
        return arrayList[index];
    }

}

