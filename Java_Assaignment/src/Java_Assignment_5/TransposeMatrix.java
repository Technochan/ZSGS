package Java_Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the matrix row size");
        int row = scan.nextInt();
        System.out.println("Enter the matrix col size");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0 ; i<matrix.length  ; i++){
            for(int j=0 ; j<matrix[i].length ; j++){
                System.out.println("Enter the val at row :"+i+"   col :"+j);
                matrix[i][j] = scan.nextInt();
            }
        }
        new TransposeMatrix().transposeMatrix(matrix);
    }
    public void transposeMatrix(int[][] matrix){
        int[][] mat = new int[matrix[0].length][matrix.length];
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                mat[j][i] = matrix[i][j];
            }
        }
        printMatrix(mat);
    }
    public static void printMatrix(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
