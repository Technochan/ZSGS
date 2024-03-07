package zoho_graduate_Studies;

import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = 101;
		int end = 120;
		
		System.out.println("No Of Students");
		int noOfStudents = scan.nextInt();
		
		int totalGroups = 4;
		int i = 0;

		while(i<totalGroups) {
			System.out.println("Group No : "+ (i+1));
			for(int j=start+i ; j<=start+noOfStudents-1 ;) {
				System.out.println(j);
				j += totalGroups;
			} i++;
			System.out.println();
		}
	}
}
