package Day_1;

public class CountHi{
	public static void main(String[] args) {
		System.out.println(countHi("xhihihixhix"));
	}
	public static int countHi(String s) {
		if(s.length() < 2) return 0;
		int count = 0;
		if(s.substring(0,2).equals("hi"))
			return count += 1 + countHi(s.substring(2));
		else 
			return countHi(s.substring(1));
	}
}
