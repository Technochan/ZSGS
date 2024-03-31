package java_assignment_10_interfaces_and_packages.com.sorting.quicksort;

import java_assignment_10_interfaces_and_packages.com.sorting.printarray.PrintSortedArray;
import java_assignment_10_interfaces_and_packages.com.sorting.sortableinterface.Sortable;

public class QuickSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        process(arr,0,arr.length-1);
        PrintSortedArray.printArray(arr);
    }
    public void process(int[] arr,int left,int right){
        if(left >= right)
            return;

        int start = left;
        int end = right;
        int mid = (start+end) / 2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        process(arr,left,end);
        process(arr,start,right);
    }

    public void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
