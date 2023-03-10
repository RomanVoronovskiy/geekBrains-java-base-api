package ru.geekbrains.java.base.api.lesson4.task4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            integerLinkedList.add(n);
            n = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < integerLinkedList.size(); i++) {
            if (integerLinkedList.get(i) < 0) {
                integerLinkedList.remove(i);
                i--;
            }
        }
        System.out.println("integerLinkedList =" + integerLinkedList);
    }
}
