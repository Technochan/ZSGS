package zoho_graduate_Studies;

import java.util.Arrays;

public class question18 {
	public static void main(String[] args) {
//		int i=0 , j= 0;
		int arr[] = {13,2,4,15,12,10,5};
		
		for(int i=0 ; i<arr.length ; i = i+2) {
			for(int j=0 ; j<arr.length ; j = j+2 ) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if(((i+1) < arr.length   &&  (j+1) < arr.length ) &&  arr[i+1] < arr[j+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
