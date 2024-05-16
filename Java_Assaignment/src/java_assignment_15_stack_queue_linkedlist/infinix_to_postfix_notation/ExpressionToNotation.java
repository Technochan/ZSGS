package java_assignment_15_stack_queue_linkedlist.infinix_to_postfix_notation;

// 2. Write a function that converts an infix expression (e.g., a + b * c) to postfix notation (e.g., a b c * +).
//Test Cases:

import java.util.Stack;

//infixToPostfix("a + b * c"): This should return "a b c * +".
//infixToPostfix("(a + b) * c"): This should return "a b + c *".
//infixToPostfix("a + (b * c)"): This should return "a b c * +".
//infixToPostfix("(a + b) * (c - d)"): This should return "a b + c d - *".
//infixToPostfix("a * (b + c) - d / (e + f)"): This should return "a b c + * d e f + / -".
//infixToPostfix("((a * b) + (c * d)) / (e - f) * (g + h)"): This should return "a b * c d * + e f - / g h + *".
public class ExpressionToNotation {
    public static void main(String[] args) {
        ExpressionToNotation obj = new ExpressionToNotation();
        String testcase1 = "a * b + c";
        String testcase2 = "(a + b) * c";
        String testcase3 = "a + (b * c)";
        String testcase4 = "(a + b) * (c - d)";
        String testcase5 = "a * (b + c) - d / (e + f)";
        String testcase6 = "((a * b) + (c * d)) / (e - f) * (g + h)";

        System.out.println("The Testcase-1 Infix Expression "+ testcase1+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase1));
        System.out.println("The Testcase-2 Infix Expression "+ testcase2+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase2));
        System.out.println("The Testcase-3 Infix Expression "+ testcase3+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase3));
        System.out.println("The Testcase-4 Infix Expression "+ testcase4+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase4));
        System.out.println("The Testcase-5 Infix Expression "+ testcase5+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase5));
        System.out.println("The Testcase-6 Infix Expression "+ testcase6+ " To Postfix Notation is = "+obj.getPostfixNotation(testcase6));
    }

    public String getPostfixNotation(String testcase){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c : testcase.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(c);
            } else if(c == '('){
                continue;
            } else if (c == ')'){
                while(!stack.isEmpty()) { // stack.peek() != '('
                   sb.append(stack.pop()); // if(start.peek() != '(')
//                   else stack.pop();
                }
            } else stack.push(c);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
