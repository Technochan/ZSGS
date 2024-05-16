package Java_Assignment_5;
// Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.
import java.util.Scanner;

public class SpiralMatrix{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N*N spiral matrix size");
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];

        int rowStart = 0 , rowEnd = size ;
        int colStart = 0 , colEnd = size ;

        int row = 0 , col = 0 ;
        int n=1;
        while(rowStart <= colEnd && colStart <= rowEnd){
            //left - right
            for(int i = row ; i < colEnd ; i++){
                matrix[row][col++] = n++;
            }
            col--;   row++;   colEnd--;

            //up - down
            for(int i = row ; i < rowEnd ; i++){
                matrix[row++][col] = n++;
            }
            row--;    col -- ;   rowEnd--;

            //right to left
            for(int i = col ; i >= colStart ; i--){
                matrix[row][col--] = n++;
            }
            col++;    row-- ;    colStart++;

            //down - up
            for(int i = row ; i > rowStart ; i-- ){
                matrix[row--][col] = n++;
            }
            row++;  col++;  rowStart++;
        }
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + "      ");
            }
            System.out.println();
        }
    }
}
