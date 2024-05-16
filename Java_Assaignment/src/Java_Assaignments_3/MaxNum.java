package Java_Assaignments_3;

import java.util.Scanner;
// Take three numbers from the user and print the greatest number.
public class MaxNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Three Numbers to get Maximum one \n");
		System.out.print("Enter the 1st Number: ");
		int num1 = scan.nextInt();
		System.out.print("Enter the 2nd Number: ");
		int num2 = scan.nextInt();
		System.out.print("Enter the 3rd Number: \n");
		int num3 = scan.nextInt();
		
		int max = num1 > num2 ?  (num1 > num3 ? num1 : num3) : ( num2 > num3 ? num2 : num3)  ;
		System.out.println("The Max Number is : "+max);
		
	}
}
