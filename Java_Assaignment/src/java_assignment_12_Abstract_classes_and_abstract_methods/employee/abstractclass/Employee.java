package java_assignment_12_Abstract_classes_and_abstract_methods.employee.abstractclass;

abstract public class Employee {
    private int employeeId;
    private String employeeName;
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public abstract double calculatePay();
    public String getEmployeeDetails() {
        return "Employee ID : " + employeeId + " |  Employee Name : " + employeeName;
    }
}
