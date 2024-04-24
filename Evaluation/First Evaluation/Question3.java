package Evaluation;

import java.util.Scanner;
// Getting huge numbers as separate digits and store them and calculate
public class Question3 {
    public static void main(String[] args) {
        Question3 question3 = new Question3();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of digits for 1st Huge Number :");
        int size1 = scan.nextInt();
        System.out.println("Enter the no of digits for 1st Huge Number :");
        int size2 = scan.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0 ; i < size1 ; i++){
            System.out.println("Enter the "+i+"th position in the Array No 1 :");
            arr1[i] = scan.nextInt();
        }

        for (int i = 0 ; i < size2 ; i++){
            System.out.println("Enter the "+i+"th position in the Array No 2 :");
            arr2[i] = scan.nextInt();
        }

        question3.sumOfArr(arr1,arr2,size1,size2);
    }

    public void sumOfArr(int[] arr1,int[] arr2,int i,int j){

        int[][] jaggedArr= new int[1][];

        int size = Math.max(i--, j--);

        int[] sumArr = new int[size];
        int rem = 0;

        while(i >= 0 || j >= 0){
            int val1 = 0;
            int val2 = 0;
            if(i >= 0){
                val1 = arr1[i];
            }
            if(j >= 0){
                val2 = arr2[j];
            }
            int sum = val1+val2+rem;
            sumArr[--size] = sum % 10;
            rem = sum / 10;
            i--;
            j--;
        }

        if(rem == 0)
            jaggedArr[0] = sumArr;
        else {
            jaggedArr[0] = getCopy(sumArr);
            jaggedArr[0][0] = rem;
        }
        printArray(jaggedArr[0]);
    }

    public int[] getCopy(int[] arr){
        int[] newArr = new int[arr.length+1];
        for (int i = 0 ; i < arr.length ; i++)
            newArr[i+1] = arr[i];

        return newArr;
    }
    public void printArray(int[] arr){
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

}
