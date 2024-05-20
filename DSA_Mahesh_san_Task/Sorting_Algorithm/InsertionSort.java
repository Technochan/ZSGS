package Sorting_Algorithm;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
       for(int i = 1 ; i < arr.length ; i++){
           int x = arr[i];
           int j = i-1;

           while(j >= 0 && arr[j] > x){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = x;
       }
    }
    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = {5,2,4,6,1,3};
        System.out.println("Before Insertion Sort applied:");
        obj.print(arr);
        System.out.println("\nAfter Insertion Sort applied: ");
        obj.insertionSort(arr);
        obj.print(arr);
    }
    void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
