package Combined_Assignment_1;
//2. Write a program with an if statement. Declare one variable inside
//the if block and another one outside. Print both variables inside and
//outside the if block to understand variable scope. (Comment the compiler
//error in your program while submitting)
public class question2 {
    public static void main(String[] args) {
        int outSideValue = 10;
        boolean loop = true;
        if(loop){
             int inSideValue = 20;

             // Here we can access both variables.
            //The outside value can be accessed into the if block
            System.out.println("Out Side Value in if block: "+ outSideValue);
            System.out.println("In side Value : "+ inSideValue);
        }
        //But here we cant access the value of the insidevalue variable.
        //Because the Value of the variable is only accessed within that particular if block
        //After the if block that value can be no more to use anywhere except that particular if block
        System.out.println("Out Side Value in if block: "+ outSideValue);

        //This line can cause compiler error
        //Error Message if (Can't find the variable called inSideValue)

//        System.out.println("In side Value : "+ inSideValue);
    }
}
