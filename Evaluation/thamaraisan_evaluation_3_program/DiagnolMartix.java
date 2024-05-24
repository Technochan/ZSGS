package thamaraisan_evaluation_3_program;

import java.util.Random;
public class DiagnolMartix
{
    public static void main(String[] args) {
        int n = 5;
        int[][] mat = new int[n][n];
        fill(mat);
        int move = 1;
        int m = n+n-1;
        for(int i = 0 ; i < m ; i++){
            int rowStart = i < n ? i : n-1;
            int colEnd = i < n ? 0 : move;
            int col = i < n ? 0 : move++;

            for(int j = rowStart ; j >= colEnd ; j--){
                System.out.print(mat[j][col++]+",");
            }
            System.out.println();
        }

    }

    public static void fill(int[][] mat){

        Random rand = new Random();
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                mat[i][j] =  rand.nextInt(100);
            }
        }
        print(mat);
        System.out.println();
    }
    public static void print(int[][] mat){
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j]+" ");

            }
            System.out.println("");
        }
    }
}
