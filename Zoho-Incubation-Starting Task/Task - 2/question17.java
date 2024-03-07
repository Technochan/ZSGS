package zoho_graduate_Studies;

import java.util.Arrays;

public class question17 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int index = 0;
		for(int i=0 ; i < arr.length ;i++) {
		     if(i%2 ==0) {
		    	 index = max(arr,i);
		    	 swap(arr,i,index);
		     }	else {
		    	 index = min(arr,i);
		    	 swap(arr,i,index);
		     }		
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
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
}
