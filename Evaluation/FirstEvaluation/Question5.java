package FirstEvaluation;
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
        while(outerSide <= innerSide){
            for(int i = outerSide ; i <= innerSide ; i++){
                mat[outerSide][i] = 1;
                mat[innerSide][i] = 1;
                mat[i][outerSide] = 1;
                mat[i][innerSide] = 1;
            }
            outerSide+=2;
            innerSide-=2;
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
