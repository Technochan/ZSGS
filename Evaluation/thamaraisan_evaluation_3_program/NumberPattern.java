package thamaraisan_evaluation_3_program;

public class NumberPattern
{
    public static void main(String[] args) {
        int n = 7;
        int m = n/2;

        for(int i = 0 ; i < n ; i++){
            int val = i <= m ? 0 : (i-m)*2;
            int dec = i <= m ? i+1 : n - i;
            for(int j = 0 ; j < n ; j++){
                if(j >= m - i + val && j <= m + i - val){

                    if(j < m){
                        System.out.print(dec--);
                    } else if(j == m ){
                        System.out.print(dec);
                    } else {
                        System.out.print(++dec);
                    }

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

