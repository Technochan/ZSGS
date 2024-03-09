import java.util.Scanner;

public class question5 {

    //Write a program to convert time entered in seconds to HH:mm:ss format
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Seconds value: ");
//        long seconds = scan.nextLong();

        int n= 210;

//
        System.out.println( "seconds "+  ((n/60)) );

        n = (n/60)/60;
        System.out.println("hours "+ n);

    }
}
