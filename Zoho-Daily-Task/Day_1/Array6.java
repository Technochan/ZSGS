package Day_1;

public class Array6 {
	public static void main(String[] args) {
		System.out.println(array6(new int[] {1,6,4},0));
	}
	public static boolean array6(int[] arr, int index) {
		if(index == arr.length-1) return false;
		if(arr[index] == 6) return true;
		else return array6(arr,index+1);
	}
}
