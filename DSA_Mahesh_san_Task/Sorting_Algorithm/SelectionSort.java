package Sorting_Algorithm;


import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] arr) {
      int n = arr.length;
       for(int i = 0 ; i < n ; i++){
           int min = i;
           for(int j = i+1 ; j < n ; j++){
               if(arr[j] < arr[min]){
                   min = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = {5,2,4,6,1,3};
        System.out.println("Before Selection Sort applied:");
        obj.print(arr);
        System.out.println("\nAfter Selection Sort applied: ");
        obj.selectionSort(arr);
        obj.print(arr);
    }
    void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
