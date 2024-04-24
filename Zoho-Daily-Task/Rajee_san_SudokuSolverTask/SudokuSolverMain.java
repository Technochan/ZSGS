package Rajee_san_SudokuSolverTask;

public class SudokuSolverMain {
    public static void main(String[] args) {

        SudokuSolver sizeThree = new SudokuSolver(3,1);
        int[][] sizeThreeMap = {
                {0,0,3},
                {0,0,1},
                {0,0,2}
        };
        System.out.println("3X3 Sudoku Before Solving");
        sizeThree.printMap(sizeThreeMap);
        if (sizeThree.solveSudoku(sizeThreeMap)) {
            System.out.println("3X3 Sudoku After Solving");
            sizeThree.printMap(sizeThreeMap);
        } else {
            System.out.println("Solution Not Found");
        }

        System.out.println("\n\n");

        SudokuSolver sizeFour = new SudokuSolver(4,2);
        int[][] sizeFourMap = {
                {0,0,3,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,0,2,0}
        };
        System.out.println("4X4 Sudoku Before Solving");
        sizeFour.printMap(sizeFourMap);
        if (sizeFour.solveSudoku(sizeFourMap)) {
            System.out.println("4X4 Sudoku After Solving");
            sizeFour.printMap(sizeFourMap);
        } else {
            System.out.println("Solution Not Found");
        }

        System.out.println("\n\n");

        SudokuSolver sizeNine = new SudokuSolver(9,3);
        int[][] sizeNineMap = {
                {1, 2, 0, 3, 0, 4, 0, 5, 6},
                {7, 0, 0, 0, 0, 6, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 0, 4, 0, 9, 0, 2, 0},
                {0, 0, 0, 0, 6, 0, 0, 0, 0},
                {0, 3, 0, 5, 0, 1, 0, 8, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {9, 0, 0, 2, 0, 0, 0, 0, 8},
                {8, 4, 0, 6, 0, 7, 0, 1, 9} };
        System.out.println("9X9 Sudoku  Before Solving");
        sizeNine.printMap(sizeNineMap);
        if (sizeNine.solveSudoku(sizeNineMap)) {
            System.out.println("9X9 Sudoku After Solving");
            sizeNine.printMap(sizeNineMap);
        } else {
            System.out.println("Solution Not Found");
        }



    }
}
