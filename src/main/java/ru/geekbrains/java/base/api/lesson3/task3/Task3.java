package ru.geekbrains.java.base.api.lesson3.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
            integerList.add(i);
        }
        System.out.println("integerList = " + integerList);
        System.out.println("integerListNoDublicate = " + unicCollection(integerList));
    }

    public static Collection unicCollection(Collection collection) {
        return new HashSet(collection);
    }
}
