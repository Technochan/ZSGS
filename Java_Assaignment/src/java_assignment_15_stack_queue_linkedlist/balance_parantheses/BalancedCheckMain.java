package java_assignment_15_stack_queue_linkedlist.balance_parantheses;


import java.util.Stack;

// 1. Write a java program that takes a string of parentheses ((, ), [, ], {, and }) and checks if it is balanced.
public class BalancedCheckMain {
    public static void main(String[] args) {
        BalancedCheckMain obj = new BalancedCheckMain();
        String testcase1 = "{()}";
        String testcase2 = "{([)]}";
        String testcase3 = "{[()]}";

        System.out.println("The testcase1 "+testcase1+" is "+ (obj.isBalanced(testcase1) ? "Balanced" : "Not Balanced"));
        System.out.println("The testcase1 "+testcase1+" is "+ (obj.isBalanced(testcase2) ? "Balanced" : "Not Balanced"));
        System.out.println("The testcase1 "+testcase1+" is "+ (obj.isBalanced(testcase3) ? "Balanced" : "Not Balanced"));
    }

    private boolean isBalanced(String testcase) {
        Stack<Character> stack = new Stack<>();

        for(char c : testcase.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(!stack.isEmpty() && (stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}') ){
                    stack.pop();
                } else return false;
            }
        }

        return stack.isEmpty();
    }
}
