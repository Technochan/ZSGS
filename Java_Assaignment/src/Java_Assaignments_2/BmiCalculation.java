package Java_Assaignments_2;

import java.util.Scanner;

//Write a program to calculate a person's Body Mass Index on
//user input for weight and height. Get BMI formula from the
//internet. height and weight for 2 or more persons and compare their BMIs.

public class BmiCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("BMI Calculation");

        System.out.println("Enter weight of Person in KG");
        float weight = scan.nextFloat();
        System.out.println("Enter height of Person in CM");
        float height = scan.nextFloat();

        double val =  weight / (height/100 * height/100 );
        double bmi = Math.round(val * 10.0) / 10.0;

        System.out.println("BMI is : " + bmi);
        scan.close();
    }
}
