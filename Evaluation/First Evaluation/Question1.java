package Evaluation;

import java.util.Scanner;
// Pattern printing
public class Question1 {
    public static void main(String[] args) {
        Question1 question1 = new Question1();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Character (A - Z Only) :");
        char input = scan.next().charAt(0);
        question1.makePattern(input);
    }

    public void makePattern(char input){
        int row = (input - 'A');
        int n = row*2+1;
        char c = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i + j == row || i - j == row  || ( j - i) == row || i + j == row + n-1 ){
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(i < row) c++;
            else c--;
        }
    }


}
