package Java_Assaignments_1;
// Write a Java program that gets a number from the user and displays the name of the weekday. Use enum.
import java.util.Scanner;

public class WeekDay {
    enum WeekDays{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;

        public static WeekDays get(int number) {
            return values()[number - 1];
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1-7 to find the WeekDay");
        int day = scan.nextInt();

        if(day <= 0 || day > 7){
            System.out.println("Wrong Input");
        } else {
            System.out.println(WeekDays.get(day));
        }
    }
}
