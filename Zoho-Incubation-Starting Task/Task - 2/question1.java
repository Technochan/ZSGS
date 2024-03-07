package zoho_graduate_Studies;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(char val = scan.next().charAt(0) ; val<='Z' ; val++) {
			System.out.print(val);
		}
	}
}
