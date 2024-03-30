package Java_Assaignments_2;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the a Value ");
        double a = scan.nextDouble();
        System.out.print("Enter the b Value ");
        double b = scan.nextDouble();
        System.out.print("Enter the c Value ");
        double c = scan.nextDouble();
        double x = b * b - 4.0 * a * c;

        if (x > 0.0) {
            double r1 = (-b + Math.pow(x, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(x, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (x == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }
    }
}
