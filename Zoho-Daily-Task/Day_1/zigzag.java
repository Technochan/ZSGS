package Day_1;

import java.util.Scanner;

public class zigzag {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		System.out.println("Enter the Number of rows");
		int n = scan.nextInt();
		char[][] mat = new char[n][s.length()-n];

		int row = 0;
		int col = 0;	
		
		int k=0;
		while( k <= s.length()-1) {
			//for top - down
			for(; row<n && k <= s.length()-1 ;) mat[row++][col] = s.charAt(k++);
			col++;
			row = row - 2;
			//for cross
			for(;row > 0 && k <= s.length()-1 ; ) mat[row--][col++] = s.charAt(k++);
		} 
		print(mat);
		
	}
	public static void print(char[][] mat) {
		for(int i=0 ; i<mat.length ; i++) {
			for(int j=0 ; j<mat[i].length ; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
