package java_assignment_11_exception_handling;

import java.util.EnumMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter the Numerator :");
            int numerator = scan.nextInt();
            System.out.println("Enter the Denominator :");
            int denominator = scan.nextInt();
            System.out.println(numerator / denominator);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage() + "| Input Must be Integer value");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + "| Denominator can't be 0 - (zero)");
        }
    }
}
