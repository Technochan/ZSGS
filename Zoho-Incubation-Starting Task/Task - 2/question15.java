package zoho_graduate_Studies;

import java.util.Arrays;

//print all duplicate elements
public class question15 {
	public static void main(String[] args) {
		int arr[] = {1,3,2,5,7,8,6,1,4,2,6,5,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		findDub(arr);
	}
	public static void findDub(int arr[]) {
		int dub = arr[0];
		boolean found= true;
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i] == dub && found) {
				found = false;
				System.out.println(arr[i]);
			} else if(arr[i] != dub){
				dub = arr[i];
				found = true; 
			}
		}
	}
	public static void sort(int arr[]) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}

