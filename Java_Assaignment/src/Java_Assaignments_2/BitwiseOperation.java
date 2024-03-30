package Java_Assaignments_2;

import java.util.Scanner;

public class BitwiseOperation {
    public static void main(String[] args) {
        //Get two numbers from user and perform bitwise
        //AND< OR, XOR, left and right shift operations on them.

        Scanner scan = new Scanner(System.in);
        System.out.println("Checking all types of bitwise operators");

        System.out.println("Enter the num 1 : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the num 2 : ");
        int num2 = scan.nextInt();

        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND: " + resultAnd);

        int resultOr = num1 | num2;
        System.out.println("Bitwise OR: " + resultOr);

        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR: " + resultXor);

        int resultNotNum1 = ~num1;
        System.out.println("Bitwise NOT of num1: " + resultNotNum1);

        int leftShiftResult = num1 << 1;
        System.out.println("Left Shift of num1: " + leftShiftResult);

        int rightShiftResult = num1 >> 1;
        System.out.println("Right Shift of num1: " + rightShiftResult);

        int zeroFillRightShiftResult = num1 >>> 1;
        System.out.println("Zero fill Right Shift of num1: " + zeroFillRightShiftResult);

    }
}
