package Java_Assignment_5;
// Write a program to implement matrix multiplication
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n---> Before give size of the try to give N*N value for Both Matrix \nelse");
        System.out.println("\n---> The first matrix row should be equal to second matrix column and \n The first matrix column size should be equal to the second matrix row size");

        System.out.println("\n\nEnter the matrix row size of matrix - 1");
        int row1 = scan.nextInt();
        System.out.println("Enter the matrix col size of matrix - 1");
        int col1 = scan.nextInt();
        int[][] matrix1 = new int[row1][col1];
        for(int i=0 ; i<matrix1.length  ; i++){
            for(int j=0 ; j<matrix1[i].length ; j++){
                System.out.println("Enter the val at row :"+i+"   col :"+j);
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.println("\n\nEnter the matrix row size of matrix - 2");
        int row2 = scan.nextInt();
        System.out.println("Enter the matrix col size of matrix - 2");
        int col2 = scan.nextInt();
        int[][] matrix2 = new int[row2][col2];
        for(int i=0 ; i<matrix2.length  ; i++){
            for(int j=0 ; j<matrix2[i].length ; j++){
                System.out.println("Enter the val at row :"+i+"   col :"+j);
                matrix2[i][j] = scan.nextInt();
            }
        }

        new MatrixMultiplication().matrixMultiplication(matrix1,matrix2);
    }
    public void matrixMultiplication(int[][] matrix1,int[][] matrix2){
       int[][] result = new int[matrix1.length][matrix2[0].length];{

            for(int i=0 ; i<matrix1.length ; i++){
                for(int j=0 ; j<matrix2[i].length ; j++){
                    int value = 0;
                    for(int k=0 ; k<matrix1[i].length ; k++){
                        value += matrix1[i][k] * matrix2[k][j];
                    }
                    result[i][j] = value;
                }
            }
        }
        printMatrix(result);
    }
    public static void printMatrix(int[][] mat) {
        System.out.println("\n\nMatrix multiplication value");
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
