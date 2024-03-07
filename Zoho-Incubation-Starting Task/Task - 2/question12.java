package zoho_graduate_Studies;

public class question12 {
	public static void main(String[] args) {
		char input = 'a';
		if(check(input)) {
			System.out.println("Input " +input+" is an alphabet");
		} else {
			System.out.println("Input "+input+" is not an alphabet");
		}
	}
	public static boolean check(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c < 'Z');
	}
}
