package Rajee_san_SudokuSolverTask;

public class SudokuSolver {
    private final int MAP_LENGTH ;
    private final int SUB_BOX;

    public SudokuSolver(int mapLength,int subBox) {
        MAP_LENGTH = mapLength;
        SUB_BOX = subBox;
    }

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
        int subBoxRow = row - row % SUB_BOX;
        int subBoxCol = col - col % SUB_BOX;

        for(int i = subBoxRow ; i < SUB_BOX; i++){
            for(int j = subBoxCol ; j < SUB_BOX ; j++){
                if(map[i][j] == num) return true;
            }
        }
        return false;
    }

    public void printMap(int[][] map) {
        linePrint(MAP_LENGTH*3);

        for (int i = 0; i < MAP_LENGTH; i++) {
            System.out.print("| ");
            for (int j = 0; j < MAP_LENGTH; j++) {
                System.out.print(map[i][j] + " ");
                if ((j + 1) % SUB_BOX == 0)
                    System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % SUB_BOX == 0)
                linePrint(MAP_LENGTH*3);
        }
    }

    private void linePrint(int width) {
        System.out.print("+");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }


}
