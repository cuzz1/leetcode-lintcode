package src;

import java.util.Stack;

public class Solution012 {
    
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();
    
    public Solution012() {
        // do intialization if necessary
        
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        if (!stack1.isEmpty()) {
            if (stack2.peek() < number) {
                stack2.push(stack2.peek());
            } else {
                stack2.push(number);
            }
        } else {
            stack2.push(number);
        }
        stack1.push(number);
    }

    /*
     * @return: An integer
     */
    public int pop() {
       int num1 = stack1.pop();
       int num2 = stack2.pop();
       return num1;
    }

    /*
     * @return: An integer
     */
    public int min() {
        return stack2.peek();
    }
}