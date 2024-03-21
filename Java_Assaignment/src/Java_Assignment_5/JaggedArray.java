package Java_Assignment_5;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the jagged array size - (Persons count)");
        int row = scan.nextInt();
        int[][] jaggedArray = new int[row][];

        for(int i = 0 ; i<row ; i++){
            System.out.println("Enter the person "+ (i+1)+ " Weight count");
            int rowCount = scan.nextInt();
            jaggedArray[i] = new int[rowCount];
            for(int j=0 ; j<rowCount ; j++){
                System.out.println("Enter the person "+ (i+1)+ " Weight "+ (j+1));
                jaggedArray[i][j] = scan.nextInt();
            }

        }
        verifyWeight(jaggedArray);

    }
    public static void verifyWeight(int[][] jaggedArray){
        for(int i = 0; i < jaggedArray.length; i++) {
            int minWeight = Integer.MAX_VALUE;
            for (int j = 0; j < jaggedArray[i].length; j++) {
                minWeight = Math.min( minWeight , jaggedArray[i][j]);
            }
            System.out.println("Person "+ (i+1)+" Min Weight is "+ minWeight);
        }
    }

}
