package com.collections;

import java.util.ArrayList;

class Student {
    private String name;
    private double marks1, marks2, marks3, average, total;

    public Student(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.total = marks1 + marks2 + marks3;
        this.average = this.total / 3.0;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public double getTotal() {
        return total;
    }
}

class StudentCollection {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudents() {
        // Add 20 student objects to the list
        students.add(new Student("Student1", 90.0, 85.0, 78.0));
        students.add(new Student("Student2", 75.0, 80.0, 70.0));
        students.add(new Student("Student9", 86.0, 76.0, 71.0));
        students.add(new Student("Student10", 95.0, 85.0, 78.0));
        students.add(new Student("Student11", 69.0, 88.0, 93.0));
        students.add(new Student("Student4", 80.0, 85.0, 90.0));
        students.add(new Student("Student5", 75.0, 73.0, 84.0));
        students.add(new Student("Student6", 91.0, 87.0, 83.0));
        students.add(new Student("Student13", 93.0, 77.0, 86.0));
        students.add(new Student("Student14", 93.0, 88.0, 74.0));
        students.add(new Student("Student15", 70.0, 95.0, 88.0));
        students.add(new Student("Student16", 80.0, 86.0, 88.0));
        students.add(new Student("Student17", 91.0, 95.0, 78.0));
        students.add(new Student("Student18", 70.0, 87.0, 74.0));
        students.add(new Student("Student19", 84.0, 76.0, 69.0));
        students.add(new Student("Student20", 79.0, 86.0, 92.0));
        students.add(new Student("Student12", 77.0, 83.0, 80.0));

       
    }

    public void studentDetails() {
        System.out.println("Students with average >= 60:");
        displayStudentsByAverageRange(60, Double.MAX_VALUE);

        System.out.println("Students with average > 50 and average < 60:");
        displayStudentsByAverageRange(50, 60);

        System.out.println("Students with average <= 50:");
        displayStudentsByAverageRange(0, 50);
    }

    private void displayStudentsByAverageRange(double min, double max) {
        for (Student student : students) {
            if (student.getAverage() >= min && student.getAverage() < max) {
                System.out.println("Name: " + student.getName() + ", Average: " + student.getAverage() + ", Total: " + student.getTotal());
            }
        }
    }
}

