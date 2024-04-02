package java_assignment_12_Abstract_classes_and_abstract_methods.employee.employeeclasses;

import java_assignment_12_Abstract_classes_and_abstract_methods.employee.abstractclass.Employee;

public class SalariedEmployee extends Employee {

    private int workingDaysInMonth = 23;
    private double salaryPerDay;

    public SalariedEmployee(String name, int id, double salaryPerDay) {
        super(id, name);
        this.salaryPerDay = salaryPerDay;
    }

    @Override
    public double calculatePay() {
        return salaryPerDay * workingDaysInMonth;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " | Monthly Salary is : " + calculatePay();
    }

    public void setWorkingDaysInMonth(int days){
        workingDaysInMonth = days;
    }

}
