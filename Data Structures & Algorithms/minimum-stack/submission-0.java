class MinStack {
    
    Stack<Integer> stack;
    Stack<Integer> mirror;
    public MinStack() {
        stack = new Stack<Integer>();
        mirror = new Stack<Integer>();
    }
    
    public void push(int val) {
        if (mirror.isEmpty()) {
            mirror.push(val);
        } else {
            // Push the smaller between val and the current min
            mirror.push(Math.min(val, mirror.peek()));
        }
        stack.push(val);
    }
    
    public void pop() {
        mirror.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mirror.peek();
    }
}
