package Java_Assaignments_3;

import java.util.Scanner;

public class DaysCountInMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month and Year to get No.Of.Days in that month \n");
		System.out.println("Enter the month  (1 - 12 )");
		int month = scan.nextInt();
		System.out.println("Enter the Year (1000 - 9999) ");
		int year = scan.nextInt();
		
		if((month < 1 && month > 12 ) || (year < 1000 || year > 9999)) {
			System.out.println("Invalid Input");
			return;
		} 
		
		System.out.println("Total Days In the " + findMonth(month)   +" is : " + findDayCount(month,year));
		scan.close();
	}
	
	public static int findDayCount(int month , int year) {
		if( (year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0) ) {
			if(month == 2) return 29;
		}
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		return days[month - 1];
		
	}
	public static String findMonth(int month) {
		String[] months = {"January","February","Match","April","May","June",
				            "July", "August","September","October","November",
				            "December"};
		return months[month-1];
	}
}
