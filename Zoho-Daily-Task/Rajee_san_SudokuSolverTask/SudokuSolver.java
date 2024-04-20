package Rajee_san_SudokuSolverTask;

public class SudokuSolver {
    private final int MAP_LENGTH = 9;
    public boolean solveSudoku(int[][] map){
        for(int i = 0 ; i < MAP_LENGTH; i++){
            for(int j = 0 ; j < MAP_LENGTH ; j++){
                if(map[i][j] == 0){
                    for(int num = 1 ; num <= MAP_LENGTH ; num++) {
                        if (isValidPosition(map, num, i, j)) {
                            map[i][j] = num;

                            if(solveSudoku(map)){
                                return true;
                            } else {
                                map[i][j] = 0; // Backtracking
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidPosition(int[][] map,int num,int row,int col){
        return !checkInRow(map,row,num) && !checkInCol(map,col,num) && !checkInSubBox(map,row,col,num);
    }

    public boolean checkInRow(int[][] map,int row,int num){
        for(int i = 0 ; i < MAP_LENGTH ; i++){
            if(map[row][i] == num) return true;
        }
        return false;
    }

    public boolean checkInCol(int[][] map,int col,int num){
        for(int i = 0 ; i < MAP_LENGTH ; i++){
            if(map[i][col] == num) return true;
        }
        return false;
    }

    public boolean checkInSubBox(int[][] map,int row,int col,int num){
        int subBoxRow = row - row % 3;
        int subBoxCol = col - col % 3;

        for(int i = subBoxRow ; i < 3; i++){
            for(int j = subBoxCol ; j < 3 ; j++){
                if(map[i][j] == num) return true;
            }
        }
        return false;
    }

    public void printMap(int[][] map){
        System.out.println("+-------+-------+-------+");
        for(int i = 0 ; i < 9; i++){
            System.out.print("| ");
            for(int j = 0 ; j < 9 ; j++){
                System.out.print(map[i][j] + " ");
                if ((j + 1) % 3 == 0)
                    System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0)
                System.out.println("+-------+-------+-------+");
        }
    }


    public static void main(String[] args) {
        SudokuSolver sudokuSolver = new SudokuSolver();
        int[][] map = {
                {9, 0, 0, 8, 4, 1, 3, 0, 0},
                {0, 0, 1, 9, 0, 0, 4, 2, 0},
                {0, 0, 0, 2, 0, 0, 0, 1, 0},
                {8, 7, 0, 1, 0, 0, 5, 4, 0},
                {1, 5, 0, 3, 6, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 7, 6, 0},
                {7, 2, 0, 0, 0, 5, 1, 9, 0},
                {6, 3, 0, 0, 0, 0, 2, 0, 7},
                {0, 1, 5, 7, 0, 2, 0, 0, 8} };
        System.out.println("Before Solving");
        sudokuSolver.printMap(map);
        if (sudokuSolver.solveSudoku(map)) {
            System.out.println("After Solving");
            sudokuSolver.printMap(map);
        } else {
            System.out.println("Solution Not Found");
        }
    }
}
