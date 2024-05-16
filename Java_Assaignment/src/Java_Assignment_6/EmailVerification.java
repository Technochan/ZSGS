package Java_Assignment_6;

// Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions
import java.util.Scanner;

public class EmailVerification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Email to Check");
        String input = scan.nextLine();
        System.out.println("The Original Email is : "+ input);
        System.out.println("The Valid Email is : "+ new  EmailVerification().verifyEmail(input));
    }
    public String verifyEmail(String email) {
        String localName ="";
        String domainName = "";

        int i;
        for(i = 0 ; i < email.length() ; i++) {
            if(email.charAt(i) == '@') break;
            else {
                if(email.charAt(i) == '.') continue;
                else {
                    if(email.charAt(i) == '+') {
                        while(email.charAt(i) != '@') i++;
                        i--;
                    } else {
                        localName += email.charAt(i);
                    }
                }
            }
        }
        for(; i<email.length() ; i++) domainName += email.charAt(i);
        return  localName+domainName;
    }
}
