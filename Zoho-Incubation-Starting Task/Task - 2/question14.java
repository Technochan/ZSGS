package zoho_graduate_Studies;

import java.util.Arrays;

//Copy one array element into other array
public class question14 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int newArr[] = getCopy(arr);
		System.out.println("Original Array "+ Arrays.toString(arr));
		System.out.println("Copy  Array "+ Arrays.toString(newArr));
	}
	public static int[] getCopy(int arr[]) {
		int newArr[] = new int[arr.length];
		int i=0;
		for(int j : arr) newArr[i++] = j;
		return newArr;
	}

}
