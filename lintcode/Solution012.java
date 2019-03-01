public class MinStack {
    
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    public MinStack() {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        stack1.push(number);
        if (stack2.isEmpty()) {
            stack2.push(number);
            return;
        } 
        
        if (number < stack2.peek()) {
            stack2.push(number);
        } else {
            stack2.push(stack2.peek());
        }
    }

    /*
     * @return: An integer
     */
    public int pop() {
        stack2.pop();
        return stack1.pop();
    }

    /*
     * @return: An integer
     */
    public int min() {
        return stack2.peek();
    }
}
