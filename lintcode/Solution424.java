package src;

import java.util.Stack;

public class Solution424 {
    /**
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    public int evalRPN(String[] tokens) {
        
        Stack<String> numStack = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++) {
            
            String str = tokens[i];
            
            if ("+".equals(str) ||  "-".equals(str) ||  "*".equals(str) ||  "/".equals(str)) {
                int num2 = Integer.valueOf(numStack.pop());
                int num1 = Integer.valueOf(numStack.pop());
                int res = 0;
                
                if ("+".equals(str)) {
                    res = num1 + num2;  
                } 
                if ("-".equals(str)) {
                    res = num1 - num2;  
                } 
                if ("*".equals(str)) {
                    res = num1 * num2;  
                } 
                if ("/".equals(str)) {
                    res = num1 / num2;  
                } 
                
                numStack.push(res + "");
                    
            } else {
                numStack.push(str);       
            }
        }
        
        return Integer.valueOf(numStack.pop());
    }
}