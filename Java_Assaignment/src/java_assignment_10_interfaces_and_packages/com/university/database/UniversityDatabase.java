package java_assignment_10_interfaces_and_packages.com.university.database;

import java_assignment_10_interfaces_and_packages.com.university.courses.Course;
import java_assignment_10_interfaces_and_packages.com.university.faculty.Faculty;
import java_assignment_10_interfaces_and_packages.com.university.students.Student;

import java.util.ArrayList;
import java.util.List;

public class UniversityDatabase {
    private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }


    public List<Student> getAllStudents() {
        return students;
    }


    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Faculty> getAllFaculties() {
        return faculties;
    }


    public void updateCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == course.getCourseId()) {
                courses.set(i, course);
                return;
            }
        }
    }


    public void updateFaculty(Faculty faculty) {
        for (int i = 0; i < faculties.size(); i++) {
            if (faculties.get(i).getId() == faculty.getId()) {
                faculties.set(i, faculty);
                return;
            }
        }
    }
}
