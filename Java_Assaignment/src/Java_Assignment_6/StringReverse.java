package Java_Assignment_6;

// Write a program to reverse the characters of a string.
import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thr String to Reverse");
        String input = scan.nextLine();
        System.out.println("The Original String is : "+ input);
        System.out.println("The reversed String is "+ new  StringReverse().reverseCharacters(input));
    }
    public String reverseCharacters(String string) {
        String reversedString = "" ;
        for(int i=string.length()-1 ; i >= 0 ; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}
