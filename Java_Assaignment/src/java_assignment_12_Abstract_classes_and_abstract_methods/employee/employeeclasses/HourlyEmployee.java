package java_assignment_12_Abstract_classes_and_abstract_methods.employee.employeeclasses;

import java_assignment_12_Abstract_classes_and_abstract_methods.employee.abstractclass.Employee;

import java.io.FileInputStream;

public class HourlyEmployee extends Employee {

    private int workingDaysInMonth = 22;
    private double workingHourPerDay;
    private double hourlySalary;

    public HourlyEmployee(String name, int id, double workingHourPerDay, double hourlySalary) {
        super(id, name);
        this.workingHourPerDay = workingHourPerDay;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculatePay() {
        return workingHourPerDay * hourlySalary * workingDaysInMonth;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " | Monthly Salary is : " + calculatePay();
    }

    public void setWorkingDaysInMonth(int days){
        workingDaysInMonth = days;
    }
}
