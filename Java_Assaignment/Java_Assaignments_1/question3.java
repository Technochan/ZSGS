import java.util.Random;

public class question3 {
    public static void main(String[] args) {
        int start = 10000;
        int end =  100000;
        int random ;
        // Way One
        System.out.println("Way 1");
        for(int i=0 ; i<10 ; i++){
            random = (int) (Math.random() * ((end - start) + start));
            System.out.println(random);
        }
        System.out.println();
        System.out.println("Way 2");
        // Other way using Random Class
        Random rd = new Random();

        int x = 1000;
        for(int i=0 ; i<10 ; i++){
            System.out.println(rd.nextInt(x++));
        }

    }
}
