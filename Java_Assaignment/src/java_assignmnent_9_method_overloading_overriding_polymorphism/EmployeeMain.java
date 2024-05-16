package java_assignmnent_9_method_overloading_overriding_polymorphism;

//  Add getEmployeeDetails method to the class 'Employee' and extend it in subclasses representing different types of employees such as HourlyEmployee and SalariedEmployee and override getEmployeeDetails. Demonstrate polymorphism by printing various types of Employees by using Parent Class reference.

class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDetails() {
        return "Employee ID : " + employeeId + "|  Employee Name : " + employeeName;
    }
}

class HourlyEmployee extends Employee {
    private double hourlySalary;

    public HourlyEmployee(String name, int id, double hourlySalary) {
        super(id, name);
        this.hourlySalary = hourlySalary;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " | Hourly Salary is : " + hourlySalary;
    }
}

class SalariedEmployee extends Employee {
    private double fullSalary;

    public SalariedEmployee(String name, int id, double fullSalary) {
        super(id, name);
        this.fullSalary = fullSalary;
    }

    public double getFullSalary() {
        return fullSalary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + " | Full Salary is : " + fullSalary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("Chandru", 2342, 25000);
        Employee employee2 = new SalariedEmployee("Chan", 2313, 500000);
        System.out.println(employee1.getEmployeeDetails());
        System.out.println(employee2.getEmployeeDetails());
    }
}
