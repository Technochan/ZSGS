package java_assignment_10_interfaces_and_packages.com.university;

// Design a university management system with packages. Create packages like university.students , university.courses , and university.faculty . Implement classes within these packages to represent students, courses, and faculty members. Utilize packages to structure the code based on the functionality.

import java_assignment_10_interfaces_and_packages.com.university.universitycontrol.UniversityControl;

public class UniversityMain {
    public static void main(String[] args) {
        new UniversityControl().initialControl();
    }
}
