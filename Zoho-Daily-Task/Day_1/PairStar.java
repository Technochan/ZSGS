package Day_1;

public class PairStar {
	public static void main(String[] args) {
		System.out.println(pairStar("xxyy"));
	}
	public static String pairStar(String s) {
		if(s.length() == 1) return s;
		String result = "";
		if(s.charAt(0) == s.charAt(1)) {
			return result += s.charAt(0) + "*"  + pairStar(s.substring(1)); 
		} else return result += s.charAt(0) +  pairStar(s.substring(1)); 
	
	}
}
