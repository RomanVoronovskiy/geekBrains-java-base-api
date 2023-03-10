package ru.geekbrains.java.base.api.lesson3.task2;

import ru.geekbrains.java.base.api.lesson3.task2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Олегова", 2, 5.0, 3);
        Student student2 = new Student("Денисова", 2, 6.0, 2);
        Student student3 = new Student("Попова", 1, 7.0, 5);
        Student student4 = new Student("Семенович", 1, 7.0, 5);
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            if ((student.getMark() >= 2) && (student.getMark() <= 5) &&
                    (student.getMark() % 2 == 1) && (student.getSurName().endsWith("ова"))) {
                System.out.println("student : " + student.getSurName() + " salary: " + student.getSalary());
            }
        }
    }
}
