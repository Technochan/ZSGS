package Day_1;

import java.util.Scanner;

public class SpiralCross {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		int[][] mat = new int[n][n];
		
		int rowStart = 0;
		int colStart = 0;
		int colEnd = n-1;
		
		int row = 0;
		int col = 0;

		int k =1 ;

		while(colStart <= colEnd) {
			//cross
			while(col <= colEnd){ mat[row++][col++] = k++; }
			colEnd--;  row -= 2;  col--;

			//up
			while(row >= rowStart ){ mat[row--][col] = k++; }
			rowStart++;  row++;  col--;

			//left
			while(col > colStart){ mat[row][col--] = k++; }
			colStart += 2;  row++;   col += 2;
		}
		print(mat);
		
	}
	public static void print(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
	}
}
