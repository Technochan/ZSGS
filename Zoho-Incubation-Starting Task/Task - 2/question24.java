package zoho_graduate_Studies;

public class question24 {
	public static void main(String[] args) {
		int k=4;
		int num = 1;
		for(int i=0 ; i<4 ; i++) {
			for(int j = 0 ; j<4 ; j++) {
				if(j>=(k-1-i)) System.out.print(num++ +" ");
				else System.out.print(" ");
			}
			System.out.println();
		}
			
	}
}
