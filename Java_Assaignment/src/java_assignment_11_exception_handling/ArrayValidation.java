package java_assignment_11_exception_handling;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        try {
            int size = scan.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i]+' '); // here we will get exception
            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage() + " | Size must be Integer value");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your are trying to access the invalid index in the array");
        }
    }
}
