package Java_Assaignments_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HeatConvertor {

    public static void main(String[] args) {
        //Convert Celsius to Fahrenheit
        Scanner scan = new Scanner(System.in);
        double celsius , fahrenheit;
        System.out.println("Celsius to Fahrenheit Conversion");
        System.out.println("Enter the Celsius Ex(10.0)  : ");
        celsius = scan.nextDouble();
        fahrenheit = (celsius * 9 / 5 ) + 32;
        System.out.println("Celsius "+ celsius +" to Fahrenheit is : "+ fahrenheit);

        System.out.println();
        System.out.println("Fahrenheit to Celsius Conversion");
        System.out.println("Enter the Fahrenheit Ex(10.0)  : ");
        fahrenheit = scan.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Fahrenheit "+ fahrenheit + " to Fahrenheit is : "+ celsius);
    }
}
