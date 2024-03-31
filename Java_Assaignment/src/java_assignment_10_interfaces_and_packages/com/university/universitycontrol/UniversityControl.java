package java_assignment_10_interfaces_and_packages.com.university.universitycontrol;

import java_assignment_10_interfaces_and_packages.com.university.courses.Course;
import java_assignment_10_interfaces_and_packages.com.university.database.UniversityDatabase;
import java_assignment_10_interfaces_and_packages.com.university.faculty.Faculty;
import java_assignment_10_interfaces_and_packages.com.university.students.Student;

import java.util.List;

public class UniversityControl {

    public void initialControl() {
        UniversityDatabase universityDatabase = new UniversityDatabase();
        PrintDetails printDetails = new PrintDetails(universityDatabase); // Pass the database instance to PrintDetails

        Student student1 = new Student(1, "Chandru", "chan@gmail.com", 934234234233L, "Chennai");
        Student student2 = new Student(2, "Chandran", "Chandran@gmail.com", 984543523423L, "chennai");
        universityDatabase.addStudent(student1);
        universityDatabase.addStudent(student2);

        Course course1 = new Course(10011, "Java Master", 20000);
        Course course2 = new Course(10012, "Application Programming", 10000);
        universityDatabase.addCourse(course1);
        universityDatabase.addCourse(course2);

        Faculty faculty1 = new Faculty(12423, "Thamarai San", "Lecture");
        Faculty faculty2 = new Faculty(13221, "Bala San", "Lecture");
        universityDatabase.addFaculty(faculty1);
        universityDatabase.addFaculty(faculty2);

        printDetails.printAllStudents();
        printDetails.printAllCourses();
        printDetails.printAllFaculty();

        // Updating details
        course1.setCourseName("Data Structures");
        universityDatabase.updateCourse(course1);

        faculty1.setDepartment("God of Java");
        universityDatabase.updateFaculty(faculty1);
        System.out.println("\nAfter updation");

        printDetails.printAllCourses();
        printDetails.printAllFaculty();
    }

}
