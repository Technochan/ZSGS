package java_assignment_12_Abstract_classes_and_abstract_methods.employee.employeeclasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeControl extends  Throwable {

    private Scanner scan = new Scanner(System.in);
    public void initialControl() {
        int choice = 0, id;
        String employeeName;
        do {
            try {
                System.out.println("Choose the Employee type to give details\n----------------------------------------\n1.Hourly Employee \n2.Salaried Employee \n3.Exit");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the Employee Id");
                        id = scan.nextInt();
                        System.out.println("Enter the Employee Name");
                        employeeName = scan.next();
                        System.out.println("Enter the Employee hourly pay:");
                        double hourlyPay = scan.nextDouble();
                        System.out.println("Enter the working hours per day");
                        double workingHour = scan.nextDouble();
                        HourlyEmployee hourlyEmployee = new HourlyEmployee(employeeName, id, workingHour, hourlyPay);
                        System.out.println(hourlyEmployee.getEmployeeDetails());
                        break;
                    case 2:
                        System.out.println("Enter the Employee Id");
                        id = scan.nextInt();
                        System.out.println("Enter the Employee Name");
                        employeeName = scan.next();
                        System.out.println("Enter the Salary per day");
                        double salaryPerDay = scan.nextDouble();
                        SalariedEmployee salariedEmployee = new SalariedEmployee(employeeName, id, salaryPerDay);
                        System.out.println(salariedEmployee.getEmployeeDetails());
                        break;
                    case 3:
                        System.out.println("Bye...... Bye....... ");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch. Please enter a valid choice.");
                scan.next(); // clear the invalid input
            }
        } while (choice != 3);
    }
    public void getDetails(int choice){
        System.out.println("Enter the Employee Id");
        int id = scan.nextInt();
        System.out.println("Enter the Employee Name");
        String name = scan.next();

    }
}
