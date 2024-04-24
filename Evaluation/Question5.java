package Evaluation;
// pattern printing
public class Question5 {
    public static void main(String[] args) {
        Question5 question5 = new Question5();
        int n = 7;
        question5.makePattern(n);
    }

    public void makePattern(int n){
        int[][] mat = new int[n][n];
        int outerSide = 0;
        int innerSide = n-1;
        int num = 0;
        while(outerSide <= innerSide){
            num = num == 0 ? 1 : 0;
            for(int i = outerSide ; i <= innerSide ; i++){
                mat[outerSide][i] = num;
                mat[innerSide][i] = num;
                mat[i][outerSide] = num;
                mat[i][innerSide] = num;
            }
            outerSide++;
            innerSide--;
        }
        print(mat);
    }
    public void print(int[][] mat){
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
