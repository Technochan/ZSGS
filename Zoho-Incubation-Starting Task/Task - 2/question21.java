package zoho_graduate_Studies;

public class question21 {
	public static void main(String[] args) {
		int n = 9;
		
		for(int i=1 ; i<=n ; i++) {
			int num = 2; 
			for(int j = 1 ; j<= n*n -1 ; j++) {	
				//first space
			if(j > n-i && j < n+i) {
				if(j > n-i && j <= n) {
					System.out.print( j +" ");
				} 
				else {
					System.out.print( (j - num ) + " ");
					num = num + 2;
				} 
			} else {
				System.out.print("  ");
			} 
						
			}
			System.out.println();
		}
	}
}
