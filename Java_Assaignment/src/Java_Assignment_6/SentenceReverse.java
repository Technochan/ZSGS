package Java_Assignment_6;

// Write a program to reverse the words in a sentence.
import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Sentence to Reverse");
        String input = scan.nextLine();
        System.out.println("The Original Sentence is : "+ input);
        System.out.println("The reversed Sentence is : "+ new  SentenceReverse().stringReverse(input));
    }
    public String stringReverse(String sentence) {
        String reversedSentence = "" ;
        String word = "";
        for(int i=0 ; i < sentence.length() ; i++) {

            if(sentence.charAt(i) != ' ') {
                word += sentence.charAt(i);
            } else {
                reversedSentence = word +" "+ reversedSentence;
                word = "";
            }
        }
        return !word.isEmpty() ? word +" "+reversedSentence : reversedSentence;
    }
}
