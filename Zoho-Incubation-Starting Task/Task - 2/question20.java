package zoho_graduate_Studies;
//pattern
public class question20 {
	public static void main(String[] args) {
		int n = 9;
		
		for(int i=1 ; i<=n ; i++) {
			int num = 1; 
			for(int j = 1 ; j<= n*n -1 ; j++) {	
				//first space
			if(j > n-i && j < n+i) {
				if(j > n-i && j <= n) {
					System.out.print(num++ +" ");
				} 
				else {
					if(j == n+1) num--;
					System.out.print(--num + " ");
				} 
			} else {
				System.out.print("  ");
			} 
						
			}
			System.out.println();
		}
	}
}
