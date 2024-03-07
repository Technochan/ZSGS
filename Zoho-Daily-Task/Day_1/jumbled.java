package Day_1;

import java.util.Scanner;

public class jumbled {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		check(n);
	}
	public static void check(int n) {
		int num = n;
		while(n > 10) {
		  if( ((n%10)+1 == (n/10)%10 || (n%10)-1 == (n/10)%10 )  || ((n%10)) == (n/10)%10 ) {
		  n=n/10;
		} else {
		  System.out.println(num +"  is not a jumbled number");
		  return; }
		}
		System.out.println(num+ "  is a jumbled number");
	}
}
