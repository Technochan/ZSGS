package java_assignment_8_constructor_and_inheritance;

// Design a Student Parent class and ZSGSStudent Child class. Create constructors in both class with varying number of parameters. Call parent constructor from child constructor. Try experimenting by creating child object using parent constructor.
class Student {
    private String name;
    private int age;
    private long phoneNo;
    private String address;

    public Student(String name, int age,long phoneNo,String address) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public long getPhoneNo(){
        return phoneNo;
    }
    public String getAddress(){
        return  address;
    }
}


class ZSGSStudent extends Student {
    private int rollNumber;

    public ZSGSStudent(String name, int age,long phoneNo,String address, int rollNumber) {
        super(name, age, phoneNo, address);
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}

public class MainOfStudent {
    public static void main(String[] args) {

        Student student = new Student("chandru", 24, 98880934342L,"chennai");

        ZSGSStudent student2 = new ZSGSStudent("chan", 20, 923432442L,"Trichy",10);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Age: " + student.getPhoneNo());
        System.out.println("Student Age: " + student.getAddress());

        System.out.println("\nZSGS Student Name: " + student2.getName());
        System.out.println("ZSGS Student Age: " + student2.getAge());
        System.out.println("ZSGS Student Age: " + student2.getPhoneNo());
        System.out.println("ZSGS Student Age: " + student2.getAddress());
        System.out.println("ZSGS Student Roll Number: " + student2.getRollNumber());

        Student student3 = new ZSGSStudent("chandru", 24, 98880934342L,"chennai",50);
        System.out.println("\nTest Student Name: " + student3.getName());
        System.out.println("Test Student Age: " + student3.getAge());
        System.out.println("Test Student Age: " + student3.getPhoneNo());
        System.out.println("Test Student Age: " + student3.getAddress());
//        System.out.println("Test Student Roll Number: " + student3.getRollNumber()); // This Line gives Error
    }
}
