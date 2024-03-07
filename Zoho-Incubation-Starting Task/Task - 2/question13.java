package zoho_graduate_Studies;
//print the smallest element in the array
public class question13 {
	public static void main(String[] args) {
		int arr[] = {2,4,6,7,12,1,22,66,45,90};
		int minValue = getMinValue(arr);
		System.out.println(minValue);
	}
	public static int getMinValue(int arr[]) {
		int val = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i < val ) val = i;
		}
		return val;
	}
	
}
