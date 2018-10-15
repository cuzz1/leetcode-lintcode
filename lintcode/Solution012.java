public class MinStack {
    
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    
    
    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        if (stack1.isEmpty()) {
            stack2.push(number);
        } else {
            if (number < stack2.peek()) {
                stack2.push(number);
            } else {
                stack2.push(stack2.peek());
            }
        }
        stack1.push(number);
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
