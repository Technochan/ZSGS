package zoho_graduate_Studies;

public class question2 {
	    public static void main(String[] args) {
	        int num1 = 5;
	        int num2 = 3;

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
