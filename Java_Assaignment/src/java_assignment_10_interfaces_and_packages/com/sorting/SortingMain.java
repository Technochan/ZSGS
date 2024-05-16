package java_assignment_10_interfaces_and_packages.com.sorting;

// Define an interface named Sortable with a method sort() . Implement this interface in classes representing different sorting algorithms such as bubble sort, quicksort, and merge sort. Allow the user to input an array, select a sorting algorithm, and display the sorted array.

import java_assignment_10_interfaces_and_packages.com.sorting.sortingcontrol.SortingControl;

public class SortingMain {
    public static void main(String[] args) {
        new SortingControl().initialControl();
    }
}
