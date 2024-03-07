package zoho_graduate_Studies;

public class question27 {
	public static void main(String[] args) {
		String s = "test123string";
		String target = "123";
		System.out.println(check(s,target));
	}
	public static int check(String s,String target) {
		for(int i=0 ; i<s.length() - target.length() ; i++) {
			if(s.substring(i, i+target.length()).equals(target)) {
				return i;
			}
		}
		return -1;
	}
}
