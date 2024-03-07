package zoho_graduate_Studies;

public class question19 {
	    public static void main(String[] args) {
	        
	    	int[][] array = {{1, 2, 3},
	                         {4, 5, 6},
	                         {7, 8, 9}};
	        System.out.println("Original Array");
	        printArray(array);
	        int[][] rotatedArray = Rotate(array);
	        System.out.println("Array after left rotate");
	        printArray(rotatedArray);
	    }
	    public static int[][] Rotate(int[][] array) {
	        int row = array.length;
	        int col = array.length;

	        int[][] rotatedArray = new int[row][col];

	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                rotatedArray[col - j - 1][i] = array[i][j];
	            }
	        }
	        return rotatedArray;
	    }

	    public static void printArray(int[][] array) {
	        for (int[] row : array) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
}
