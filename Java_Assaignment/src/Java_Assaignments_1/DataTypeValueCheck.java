package Java_Assaignments_1;

// Write a program to demonstrate compatible type conversions. For eg., float to int, double to float, int to short
public class DataTypeValueCheck{
    public static void main(String[] args) {
        byte byteValue = 100;
        int intValue = byteValue;
        System.out.println("Byte to int: " + intValue);

        float floatValue = 10.5f;
        intValue = (int) floatValue;
        System.out.println("Float to int: " + intValue);

        double doubleValue = 20.7;
        float floatValue2 = (float) doubleValue;
        System.out.println("Double to float: " + floatValue2);

        int intValue2 = 1000;
        short shortValue = (short) intValue2;
        System.out.println("Int to short: " + shortValue);

        long longValue = 123456789L;
        intValue2 = (int) longValue;
        System.out.println("Long to int: " + intValue2);

        char charValue = 'Z';
        intValue2 = (int) charValue;
        System.out.println("Char to int: " + intValue2);
    }
}