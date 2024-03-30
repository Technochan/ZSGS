package java_assignment_10_interfaces_and_packages.com.university;

import java_assignment_10_interfaces_and_packages.com.university.courses.Course;
import java_assignment_10_interfaces_and_packages.com.university.faculty.Faculty;
import java_assignment_10_interfaces_and_packages.com.university.students.Student;

public class UniversityMain {
    public static void main(String[] args) {
        // Testing student class
        Student student1 = new Student(101, "John Doe", "john.doe@example.com");
        System.out.println("Student: " + student1.getName() + ", ID: " + student1.getId() + ", Email: " + student1.getEmail());

        // Testing course class
        Course course1 = new Course(1, "Introduction to Computer Science", 3);
        System.out.println("Course: " + course1.getCourseName() + ", ID: " + course1.getCourseId() + ", Credit Hours: " + course1.getCreditHours());

        // Testing faculty class
        Faculty faculty1 = new Faculty(201, "Dr. Smith", "Computer Science");
        System.out.println("Faculty: " + faculty1.getName() + ", ID: " + faculty1.getId() + ", Department: " + faculty1.getDepartment());
    }
}
