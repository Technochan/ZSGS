public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = getSum(arr);
        System.out.println("The sum of all even numbers in the array is : "+ sum);
    }
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] % 2 != 0) continue;
            sum += arr[i];
        }
        return sum;
    }
}
