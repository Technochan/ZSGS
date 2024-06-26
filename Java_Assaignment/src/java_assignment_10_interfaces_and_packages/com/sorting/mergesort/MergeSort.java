package java_assignment_10_interfaces_and_packages.com.sorting.mergesort;

import java_assignment_10_interfaces_and_packages.com.sorting.printarray.PrintSortedArray;
import java_assignment_10_interfaces_and_packages.com.sorting.sortableinterface.Sortable;

public class MergeSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        mergeSortInPlace(arr, 0, arr.length);
        PrintSortedArray.printArray(arr);
    }
     void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

     void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
