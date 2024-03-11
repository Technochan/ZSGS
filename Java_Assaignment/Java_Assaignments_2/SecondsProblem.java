import java.util.Scanner;

public class SecondsProblem {

    //Write a program to convert time entered in seconds to HH:mm:ss format
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value in Seconds to get HH:MM:SS Formate: ");
        long input = scan.nextLong();

        int hour = (int) (input / 3600);
        int minutes = (int) ((input % 3600) / 60);
        int seconds = (int) (input % 60);

        System.out.println("HR:" + hour + "  Min:" + minutes + "  Sec:" + seconds);
    }
}
