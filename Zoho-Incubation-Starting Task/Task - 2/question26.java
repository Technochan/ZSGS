package zoho_graduate_Studies;

public class question26 {
	public static void main(String[] args) {
		int n = 10;
		//upper part
		for(int i=0 ; i < n  ; i++)
		{
			for(int j=0 ; j < n + n ; j++)
			{
				if((j < n-i || j >= n+i )) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}
		//lower part
		for(int i=n-2 ; i >= 0  ; i--)
		{
			for(int j=0 ; j < n + n ; j++)
			{
				if((j < n-i || j >= n+i )) System.out.print("*");
				else System.out.print("_");
			}
			System.out.println();
		}
	}
}
