package java_assignment_12_Abstract_classes_and_abstract_methods.employee;

import java_assignment_12_Abstract_classes_and_abstract_methods.employee.employeeclasses.EmployeeControl;
// Change Employee class as abstract and add abstract methods like calculatePay() with concrete methods like getEmployeeDetails(), etc. Extend this abstract class in subclasses - HourlyEmployee and SalariedEmployee. Allow the user to input details of employees and calculate their respective pay using the abstract class reference.
public class EmployeeMain {
    public static void main(String[] args) {
        new EmployeeControl().initialControl();
    }
}
