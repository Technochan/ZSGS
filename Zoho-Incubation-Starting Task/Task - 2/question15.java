package zoho_graduate_Studies;

import java.util.HashMap;
import java.util.Map;

//print all duplicate elements
public class question15 {
	public static void main(String[] args) {
		int arr[] = {1,3,2,5,7,8,6,1,4,2,6,5,2,1};
		// First Way - Without sorting
		System.out.println("Way One By HashMap");
		way1(arr);
		System.out.println();
		// Second Way - With sorting
		System.out.println("Way two Sorting");
		sort(arr);
		way2(arr);

	}

	// First Way
	public static void way1(int arr[]){
		Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		for(int i=0 ; i<arr.length ; i++){
			if(mp.containsKey(arr[i])){
				mp.put(arr[i],mp.get(arr[i]) + 1 );
			} else mp.put(arr[i],1);
		}

		for( Map.Entry<Integer,Integer> entry : mp.entrySet()){
			if(entry.getValue() > 1) System.out.print(entry.getKey()+"  ");
		}
	}

	// Second Way
	public static void way2(int arr[]) {
		int dub = arr[0];
		boolean found= true;
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i] == dub && found) {
				found = false;
				System.out.print(arr[i]+ "  ");
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

