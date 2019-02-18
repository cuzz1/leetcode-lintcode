public class MyQueue {
    
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    public MyQueue() {
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    /*
     * @return: An integer
     */
    public int top() {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
}
