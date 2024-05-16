package java_assignment_11_exception_handling;


// Create a custom Exception by yourself and try throwing and catching the same.

import java.util.InputMismatchException;
import java.util.Scanner;

class NotEligibleForVote extends Exception{
    @Override
    public String getMessage(){
        return "Come After age 18";
    }
}
public class CustomExceptionCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter your age to check valid for voting or not");
            int age = scan.nextInt();
            if(age < 18){
                throw new NotEligibleForVote();
            }
        } catch (NotEligibleForVote e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println(e.getMessage() +" Input only Integer Values");
        }
    }
}
