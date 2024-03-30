package java_assignment_10_interfaces_and_packages.com.sorting;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Sortable{
    abstract void sort(int[] arr);
}
class BubbleSort implements Sortable{

    @Override
    public void sort(int[] arr) {

    }
}
class QuickSort implements Sortable{

    @Override
    public void sort(int[] arr) {

    }
}
class MergeSort implements Sortable{

    @Override
    public void sort(int[] arr) {

    }
}
public class SortingMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter the value at "+i+"th index");
            arr[i] = scan.nextInt();
        }
        System.out.println("Select Any One Method to do Sort \n1.Bubble Sort \n2.Quick Sort \n3.Merge Sort");

        try{
            int choice = scan.nextInt();
            switch (choice){
                case 1 :
                    System.out.println("Sorted result by using bubble sort method");
                    new BubbleSort().sort(arr);
                    break;
                case 2 :
                    System.out.println("Sorted result by using quick sort method");
                    new QuickSort().sort(arr);
                    break;
                case 3 :
                    System.out.println("Sorted result by using merge sort method");
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
