package Java_Assignment_6;
//  Create a program to count vowels in a given string using string functions
import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thr String to check the vowels count ");
        String input = scan.next();
        System.out.println("The Vowel Count in the Given input  "+ input +" has :" + new  VowelCount().countVowels(input)+" Vowels");
    }
    public int countVowels(String str) {
        int count = 0 ;
        for(int i=0 ; i<str.length() ; i++) {
            if(checkVowel(str.charAt(i))) count++;
        }
        return count;
    }
    public boolean checkVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


}
