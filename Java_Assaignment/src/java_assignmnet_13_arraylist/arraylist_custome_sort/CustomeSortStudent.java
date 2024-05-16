package java_assignmnet_13_arraylist.arraylist_custome_sort;


// Write a program that sorts an ArrayList of custom objects based on a specific property using a custom comparator class implementing the Comparator interface.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return String.format("| %-4d | %-10s | %-3d | %-5.2f |", id, name, age, marks);
    }

    public static void sortByAge(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getAge(), student2.getAge());
            }
        });
    }

    public static void sortByMarks(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Double.compare(student1.getMarks(), student2.getMarks());
            }
        });
    }
}


public class CustomeSortStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Chan", 20, 95));
        studentList.add(new Student(2, "Arun", 22, 72.2));
        studentList.add(new Student(3, "Varun", 21, 89.0));

        System.out.println("Original list:");
        printList(studentList);

        Student.sortByAge(studentList);
        System.out.println("\nAfter Sorted The List Based On The Age");
        printList(studentList);

        Student.sortByMarks(studentList);
        System.out.println("\nAfter Sorted The List Based On The Marks");
        printList(studentList);
    }

    private static void printList(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
