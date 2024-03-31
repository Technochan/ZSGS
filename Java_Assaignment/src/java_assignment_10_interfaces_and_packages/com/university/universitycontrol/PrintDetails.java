package java_assignment_10_interfaces_and_packages.com.university.universitycontrol;

import java_assignment_10_interfaces_and_packages.com.university.courses.Course;
import java_assignment_10_interfaces_and_packages.com.university.database.UniversityDatabase;
import java_assignment_10_interfaces_and_packages.com.university.faculty.Faculty;
import java_assignment_10_interfaces_and_packages.com.university.students.Student;

import java.util.List;

public class PrintDetails {


    UniversityDatabase universityDatabase;

    public PrintDetails(UniversityDatabase universityDatabase) {
        this.universityDatabase = universityDatabase;
    }

    public void printAllStudents(){
        System.out.println("Details About Students\n--------------------------");
        List<Student> allStudents = universityDatabase.getAllStudents();
        for (Student student : allStudents) {
            System.out.println(student.getId() +" | "+student.getName()+" | "+student.getPhoneNo()+" | "+student.getEmail()+" | "+student.getAddress());
        }
    }

    public void printAllCourses(){
        System.out.println("\nDetails About Courses\n------------------------------");
        List<Course> allCourses = universityDatabase.getAllCourses();
        for (Course course : allCourses) {
            System.out.println(course.getCourseId()+" | "+course.getCourseName()+" | "+course.getCoursePrice());
        }
    }

    public void printAllFaculty(){
        System.out.println("\nDetails About Faculties\n--------------------------------");
        List<Faculty> allFaculties = universityDatabase.getAllFaculties();
        for (Faculty faculty : allFaculties) {
            System.out.println(faculty.getId()+" | "+faculty.getName()+" | "+faculty.getDepartment());
        }
    }
}
