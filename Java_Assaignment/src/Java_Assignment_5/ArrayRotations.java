package Java_Assignment_5;
// Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i<size ; i++){
            System.out.println("Enter the Integer value of "+i+"th position in the array");
            arr[i] = scan.nextInt();
        }
        System.out.println("How many times that you want to perform rotation? ");
        int rotationCount = scan.nextInt();
        new ArrayRotations().rotateArray1(arr,rotationCount);
    }
    // Method One
    public void rotateArray1(int[] arr,int rotationCount){
        for(int i=0 ; i<rotationCount % arr.length ; i++){
            int temp = arr[arr.length-1];
            int j= arr.length-1;
            while(j > 0){
                arr[j] = arr[j-1];
                j--;
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr) );
    }
}
