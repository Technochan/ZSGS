package Java_Assaignments_3;

import java.util.Scanner;
// Write a program to print multiplication table of a given number in a neat format
public class MulTable {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to print its multiplication table: ");
        int number = scan.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scan.close();
    }
}
