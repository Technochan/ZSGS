package Sorting_Algorithm;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        for(int i = 0 ; i < arr.length ; i++){
            boolean swapped = false;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] arr = {5,2,4,6,1,3};
        System.out.println("Before Bubble Sort applied: ");
        obj.print(arr);
        System.out.println("\nAfter Bubble Sort applied: ");
        obj.bubbleSort(arr);
        obj.print(arr);
    }
    void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
