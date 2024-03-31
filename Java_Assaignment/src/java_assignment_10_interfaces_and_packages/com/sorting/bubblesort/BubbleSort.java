package java_assignment_10_interfaces_and_packages.com.sorting.bubblesort;


import java_assignment_10_interfaces_and_packages.com.sorting.printarray.PrintSortedArray;
import java_assignment_10_interfaces_and_packages.com.sorting.sortableinterface.Sortable;

public class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        PrintSortedArray.printArray(arr);
    }
    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
