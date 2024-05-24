package thamaraisan_evaluation_3_program;


public class SpiralMatrix
{
    public static void main(String[] args) {
        int n = 7;
        int[][] mat = new int[n][n];
        int val = 1;
        int rowStart = 0;
        int rowEnd = n;
        int colStart = 0;
        int colEnd = n;
        int row = 0;
        int col = 0;
        while(rowStart <= rowEnd && colStart <= colEnd){

            // left - right
            for(int i = col ; i < rowEnd ; i++, col++){
                mat[row][i] = val++;
            }
            col--;
            row++;
            rowEnd--;

            //top - bottom
            for(int i = row ; i < colEnd ; i++, row++){
                mat[i][col] = val++;
            }
            row--;
            col--;
            colEnd--;

            //right - left
            for(int i = col ; i >= colStart ; i--, col--){
                mat[row][i] = val++;
            }
            col++;
            row--;
            colStart++;

            //bottom - up
            for(int i = row ; i > rowStart ; i-- , row--){
                mat[i][col] = val++;
            }
            row++;
            col++;
            rowStart++;
        }

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ;  j < mat[0].length ; j++){
                System.out.print(mat[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
