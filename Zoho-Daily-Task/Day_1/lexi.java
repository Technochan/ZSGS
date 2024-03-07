package Day_1;

import java.util.Arrays;
import java.util.Scanner;

public class lexi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] arr = new String[n];
		int no = 1;
		for(int i=0 ; i<n ; i++) {
			System.out.println("Enter the string : "+no++);
			arr[i] = scan.next();
		} 
		no = 1;
		for(int i=0 ; i<n ; i++) {
			System.out.println("string : "+no++);
			System.out.println(arr[i]);
		} 
		
	}
	public static void check(String[] str) {
		
		int k=0;
		while(str.length > k) {
			char[] arr = str[k].toCharArray();
			
			for(int i=0 ; i<arr.length ; i++) {
				for(int j=i+1 ; j <arr.length ; j++ ) {
					if(arr[i] < arr[j]) {
						char temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			str[k] = Arrays.toString(arr);
			k++;
		}
		
	}
}
