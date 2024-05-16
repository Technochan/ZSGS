package Java_Assaignments_3;
// Write a program to print factorial of a given number using loop
import java.util.Scanner;
public class FactorialCalculation {
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        System.out.print("Enter a number to calculate the factorial: ");
	        int number = scan.nextInt();
	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        scan.close();
	}
}
