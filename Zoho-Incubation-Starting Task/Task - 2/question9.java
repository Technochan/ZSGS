package zoho_graduate_Studies;

import java.util.Scanner;

public class question9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int val = 0;
		while(n>0) {
			int i = n%10;
			val = val * 10 + i;
			n = n/10;
		}
		System.out.println(val);
	}
}
