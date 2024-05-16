package Java_Assaignments_4;
//  Write a program to print prime numbers between 1 to 30
public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 30;
        for(int i = start ; i<= end ; i++){
            if(i == 1) continue;
            if(isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i=2 ; i<=n/2 ; i++){
            if(n % i == 0) count++;
            if(count > 0) return false;
        }
        return true;
    }
}
