package Java_Assignment_6;

import java.util.Scanner;

public class MakeCapitalize {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Email to Check");
        String input = scan.nextLine();
        new MakeCapitalize().makeCapitalize(input);
    }
    public void makeCapitalize(String sentence){
        for(int i=0 ; i<sentence.length() ; i++){
            if(i == 0 && sentence.charAt(i) != ' ' ){
                sentence =  ((char) (sentence.charAt(i) - 32) + sentence.substring(i+1));
                continue;
            }
            if(i+1 < sentence.length() && sentence.charAt(i) == ' ' && sentence.charAt(i+1) != ' '){
                sentence =  sentence.substring(0,i) +sentence.charAt(i) +(char) (sentence.charAt(i+1) - 32) + sentence.substring(i+2);
            }
        }
        System.out.println(sentence);
    }
}
