package FirstEvaluation;

import java.util.Scanner;
// Find the largest sum of contiguous subarray which should not have negative numbers
public class Question4 {
    public static void main(String[] args) {
        Question4 question4 = new Question4();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < size ; i++){
            System.out.println("Enter the "+i+"th position element ");
            arr[i] = scan.nextInt();
        }
        question4.getSum(arr);
    }


    public void getSum(int[] arr){
        int maxSum = 0;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;

        for(int i = 0 ; i <= arr.length ; i++){
            if(i != arr.length && arr[i] >= 0){
                currentSum += arr[i];
                count++;
            } else {
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    startIndex = i - count;
                    endIndex = i-1;
                    count = 0;
                    currentSum = 0;
                }
            }
        }
        System.out.print("Sum : "+maxSum+ "\nElements : ");
        for(int i = startIndex ; i <= endIndex ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
