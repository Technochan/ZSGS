package Day_3_March07.CombinedAssaignment_1;

import java.util.Scanner;

//1. Write a program that calculates the average weight of 10 people.
// Use descriptive and meaningful variable names following Java naming
// conventions. Use proper datatypes for the variables.
public class question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumOfWeight = 0 ;
        for(int i = 1  ; i<=10 ; i++ ){
            System.out.println("Enter The Weight for Person "+ i + " :");
            sumOfWeight += scan.nextInt();
        }
        System.out.println("The average weight is :" + sumOfWeight/10);
    }
}
