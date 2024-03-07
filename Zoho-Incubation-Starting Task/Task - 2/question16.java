package zoho_graduate_Studies;

import java.util.Arrays;

// merge two sorted array
public class question16 {
	public static void main(String[] args) {
		int arr1[] = {2,4,5,6,7,9,10,13};
		int arr2[] = {2,3,4,5,6,7,8,9,11,15};
		int mergedArr[] = merge(arr1,arr2);
		System.out.println(Arrays.toString(mergedArr));
	}
	
	public static int[] merge(int arr1[],int arr2[]) {
		int mergedArr[] = new int[arr1.length+arr2.length]; 
		int i=0 , j=0;
		int index = 0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				mergedArr[index++] = arr1[i++];
				continue;
			} 
			if(arr1[i] > arr2[j]) {
				mergedArr[index++] = arr2[j++];
				continue;
			}
			if(arr1[i] == arr2[j]) {
				mergedArr[index++] = arr1[i];
				i++; j++;
				continue;
			}
		}
		while(i != arr1.length) mergedArr[index++] = arr1[i++];
		while(j != arr2.length) mergedArr[index++] = arr2[j++];
		
		return Arrays.copyOfRange(mergedArr, 0, index) ;
	}
}
