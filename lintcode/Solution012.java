public class MinStack {
    
    private Stack<Integer> stack1; 
    private Stack<Integer> stack2; 
    
    public MinStack() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

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

    public int pop() {
        stack2.pop();
        return stack1.pop();
    }

    public int min() {
        return stack2.peek();
    }
}
