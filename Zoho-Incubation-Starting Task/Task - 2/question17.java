package zoho_graduate_Studies;

import java.util.Arrays;

public class question17 {
	public static void main(String[] args) {
		int arr[] = {5,9,1,3,7,2,4,8,11};

		//Way 1 - Without Sorting
		int index = 0;
		for(int i=0 ; i < arr.length ;i++) {
			if (i % 2 == 0) {
				index = max(arr, i);
				swap(arr, i, index);
			} else {
				index = min(arr, i);
				swap(arr, i, index);
			}
		}
		System.out.println("Way 1 Without Sorting and Rearranged in same array");
		System.out.println(Arrays.toString(arr));

		//Way 2 - After Sorting
		Arrays.sort(arr);
		int newArr[] = new int[arr.length];
		int left = 0;
		int right = arr.length-1;
		index = 0;
		while(left <= right){
			newArr[index++] = arr[right--];
			if(index < newArr.length) newArr[index++] = arr[left++];
		}
		System.out.println("Way 2 After sorting added elements in new array");
		System.out.println(Arrays.toString(newArr));

	}
	// Way 1 - Without Sorting
	public static int min(int[] arr,int start) {
		int val = Integer.MAX_VALUE;
		int index = 0;
		for(int i=start ; i<arr.length ; i++) {
			if(arr[i] < val) {
				val = arr[i];
				index = i;
			}
		}
		return index;
	}
	public static int max(int[] arr,int start) {
		int val = Integer.MIN_VALUE;
		int index = 0;
		for(int i=start ; i<arr.length ; i++) {
			if(arr[i] > val) {
				val = arr[i];
				index = i;
			}
		}
		return index;
	}





	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
