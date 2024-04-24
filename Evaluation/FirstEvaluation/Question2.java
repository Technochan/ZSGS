package FirstEvaluation;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
// Arrange the array elements in descending order based on their frequency

public class Question2 {
    public static void main(String[] args) {
        Question2 question2 = new Question2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array Size :");
        int size = scan.nextInt();
        int[] arr = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.println("Enter the element at "+i+"th position");
            arr[i] = scan.nextInt();
        }
        int[] arrangedArray = question2.reArrange(arr);
        question2.printArray(arrangedArray);
    }

    public int[] reArrange(int[] arr){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , 1);
            } else {
                map.put(arr[i] , map.get(arr[i])+1);
            }
        }

        int start = 0;
        while(map.size() != 0){
            int val = 0;
            int occur = 0;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue() > occur){
                    occur = entry.getValue();
                    val = entry.getKey();
                }
            }
            map.remove(val);
            while(occur > 0 ){
                arr[start++] = val;
                occur--;
            }
        }
        return arr;
    }

    public void printArray(int[] arr){
        System.out.println("\nSorted array based on frequency : ");
        for (int n : arr){
            System.out.print(n+" ");
        }
    }
}
