public class Swapping {
    public static void main(String[] args) {
        // Swapping the two Numbers
        //Way One - Using temp variable

        int a = 10;
        int b = 20;

        System.out.println("Before swapping  A :"+a +"  B:"+b );

        int temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping Way One A :"+a +"  B:"+b );

        // Way two
        a = 10;
        b = 20;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping Way Two A :"+a +"  B:"+b );

    }
}
