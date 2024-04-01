package java_assignment_11_exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class OutOfRangeException extends Exception{
    @Override
    public String getMessage(){
        return "Enter only 10 digits";
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
        } catch (InputMismatchException e){
            System.out.println(e.getMessage() + " Enter Must Integer Numbers");
        } catch (OutOfRangeException e){
            System.out.println(e.getMessage());
        }
    }
}
