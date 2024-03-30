package java_assignment_7_class_and_object_and_encapsulation;

public class EmployeeDTO {
    // Instance variables Declaration
    private final int employeeId;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phoneNumber;
    private String address;
    private static int nextEmployeeId = 1000;

    // Constructor
    public EmployeeDTO(String firstName, String lastName, String email, String phoneNumber,String address) {
        this.employeeId = generateEmployeeId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    //Protected the employeeId Incrementation here
    private int generateEmployeeId() {
        return nextEmployeeId++;
    }

    // Getter method to show the employees details in read-only mode
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNextEmployeeId() {
        return nextEmployeeId;
    }

    // May be the employee can change his address - So Provide setter method also
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
