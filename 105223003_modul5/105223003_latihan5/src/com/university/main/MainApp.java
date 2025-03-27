package com.university.main;

import com.university.model.Student;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = {
            new Student("ST0001", "Augustine", 21, 3.8),
            new Student("ST0002", "Betty", 20, 3.6),
            new Student("ST0003", "Caroline", 21, 3.9),
            new Student("ST0004", "Dean", 23, 3.5),
            new Student("ST0005", "Eve", 20, 3.7)
        };

        System.out.println("=== Data Mahasiswa ===");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Nama: " + student.getName() + ", Umur: " + student.getAge() + ", GPA: " + student.getGpa());
        }
    }
}