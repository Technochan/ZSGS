package Day_1;

public class ParenBit {
	public static void main(String[] args) {
		System.out.println(parenBit("x(hello)"));
	}
	public static String parenBit(String str) {
		if(str.charAt(0) == ')') return ")";
		String result = "";
		
		if(str.charAt(0) != '(' && str.indexOf('(') != -1) {
			return parenBit(str.substring(1));
		}
		return result += str.charAt(0) + parenBit(str.substring(1));	
	}
}
