package java_assignment_11_exception_handling;

// Create a program to get phone number from the user and throw InputMismatchException if the user enters non-number input

import java.util.InputMismatchException;
import java.util.Scanner;

class OutOfRangeException extends Exception{
    @Override
    public String getMessage(){
        return "The Phone Number Should Be 10 digits";
    }
}
public class PhoneNumberValidate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your phone number :");
        try{
            long phoneNo = scan.nextLong();
            if (String.valueOf(phoneNo).length() != 10){
                throw new OutOfRangeException();
            }
            System.out.println("Phone Number is valid");
        } catch (InputMismatchException e){
            System.out.println("Enter only Integer Value");
        } catch (OutOfRangeException e){
            System.out.println(e.getMessage());
        }
    }
}
