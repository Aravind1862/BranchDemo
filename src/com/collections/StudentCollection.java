package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

class MyCollection {
    private LinkedList<Student> linkedList;
    private ArrayList<Student> arrayList;

    public MyCollection() {
        linkedList = new LinkedList<>();
        arrayList = new ArrayList<>();
    }

    public void addStudentsToLinkedList() {
        
        for (int i = 0; i < 20; i++) {
            Student student = new Student(null, i, i, i); 
            linkedList.add(student);
        }
    }

    public void sortStudents() {
        for (int i = 0; i < linkedList.size(); i++) {
            Student student = linkedList.get(i);
            if (student.getAverage() >= 60) {
                arrayList.add(student);
                linkedList.remove(i);
                i--; 
            }
        }

       
        int studentsWithAverage60OrAbove = arrayList.size();
        int studentsWithAverageBelow60 = linkedList.size();
        System.out.println("Students with average >= 60: " + studentsWithAverage60OrAbove);
        System.out.println("Students with average < 60: " + studentsWithAverageBelow60);
    }
}
