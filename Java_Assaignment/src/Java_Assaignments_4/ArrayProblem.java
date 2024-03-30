package Java_Assaignments_4;

public class ArrayProblem {
    public static void main(String[] args) {
        int[] arr = {2,3,4,2,8,7};
        int target = 2;
        int index = findTargetIndex(arr,target);
        System.out.println("Index of the target is : " +index);
    }

    public static int findTargetIndex(int[] arr, int target){
        int occurs = 0 ;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] == target) occurs++;
            if(occurs == 2) return i;
        }
        return -1;
    }

}
