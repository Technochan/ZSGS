package zoho_graduate_Studies;

public class question10 {
	
	public static void main(String[] args) {
		String str = "one two three";
		String[] arr = str.split(" ");
		String ans = reverse(arr,arr.length-1);
		System.out.println(ans);
	}
	public static String reverse(String[] str,int i) {
		if(i == 0)
			return str[i];
		else
			return str[i] + " " + reverse(str, i-1);
	}
}
