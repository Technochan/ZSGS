package zoho_graduate_Studies;

public class question11 {
	public static void main(String[] args) {
		String str = "b3c6d15";
		int i=0;
		for( ; i<str.length() ; i++ ) {	
			if(Character.isLetter(str.charAt(i))) {
				char c = str.charAt(i);
				int val = 0;
				while(i<str.length()-1 &&  !Character.isLetter(str.charAt(++i))) {
					val = val * 10 + Character.getNumericValue(str.charAt(i));	
				} i--;
				while(val > 0) {
					System.out.print(c);
					val--;
				}
			}
		}
	}
}
