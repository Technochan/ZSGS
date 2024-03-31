package java_assignment_10_interfaces_and_packages.com.sorting.sortingcontrol;

import java_assignment_10_interfaces_and_packages.com.sorting.bubblesort.BubbleSort;
import java_assignment_10_interfaces_and_packages.com.sorting.mergesort.MergeSort;
import java_assignment_10_interfaces_and_packages.com.sorting.quicksort.QuickSort;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingControl {
    public void initialControl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to The Sorting Application\n\nEnter the array size");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter the value at "+i+"th index in array");
            arr[i] = scan.nextInt();
        }
        System.out.println("\nSelect Any One Method to do Sort\n--------------------------------- \n1.Bubble Sort \n2.Quick Sort \n3.Merge Sort");

        try{
            int choice = scan.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("\nSorted result by using bubble sort method");
                    new BubbleSort().sort(arr);
                    break;
                case 2 :
                    System.out.println("\nSorted result by using quick sort method");
                    new QuickSort().sort(arr);
                    break;
                case 3 :
                    System.out.println("\nSorted result by using merge sort method");
                    new MergeSort().sort(arr);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
