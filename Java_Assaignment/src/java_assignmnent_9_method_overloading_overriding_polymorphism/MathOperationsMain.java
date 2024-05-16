package java_assignmnent_9_method_overloading_overriding_polymorphism;


// Create a Java class MathOperations with methods for basic mathematical operations such as add() , subtract() , multiply() , and divide() . Implement method overloading to allow these operations for integers, doubles, and optionally, other types.

class MathOperations{
    // For Addition
   public int add(int a,int b){
       return a + b;
   }
   public double add(double a,double b){
       return a + b;
   }
   public long add(long a,long b){
       return a + b;
   }
   // For Subtraction
    public int sub(int a,int b){
        return a - b;
    }
    public double sub(double a,double b){
        return a - b;
    }
    public long sub(long a,long b){
        return a - b;
    }
    // For multiplication
    public int mul(int a,int b){
        return a * b;
    }
    public double mul(double a,double b){
        return a * b;
    }
    public long mul(long a,long b){
        return a * b;
    }
    // For Division
    public int div(int a,int b){
        return a / b;
    }
    public double div(double a,double b){
        return a / b;
    }
    public long div(long a,long b){
        return a / b;
    }
    // For Modulo
    public int mod(int a,int b){
        return a % b;
    }
    public double mod(double a,double b){
        return a % b;
    }
    public long mod(long a,long b){
        return a % b;
    }

}
public class MathOperationsMain {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        //For Integer
        System.out.println("Integer Addition :"+mathOperations.add(5,10));
        System.out.println("Integer Subtraction :"+mathOperations.sub(10,5));
        System.out.println("Integer Multiplication :"+mathOperations.add(10,10));
        System.out.println("Integer Division :"+mathOperations.sub(10,5));
        System.out.println("Integer Modulo :"+mathOperations.sub(10,5)); // B Should not be 0 else we get exception

        System.out.println("Double Addition :"+mathOperations.add(5.56,10.45));
        System.out.println("Double Subtraction :"+mathOperations.sub(25.24,2.45));
        System.out.println("Double Multiplication :"+mathOperations.add(30.45,10.00));
        System.out.println("Double Division :"+mathOperations.sub(10.34,5.34));
        System.out.println("Double Modulo :"+mathOperations.sub(10.12,5.43)); // B Should not be 0 else we get exception

        System.out.println("Long Addition :"+mathOperations.add(52311232123L,1021231233213L));
        System.out.println("Long Subtraction :"+mathOperations.sub(21231235123L,2112322231231L));
        System.out.println("Long Multiplication :"+mathOperations.add(31230123123L,101231231223L));
        System.out.println("Long Division :"+mathOperations.sub(7968967854L,123123123L));
        System.out.println("Long Modulo :"+mathOperations.sub(87652343L,23424234L)); // B Should not be 0 else we get exception


    }
}
