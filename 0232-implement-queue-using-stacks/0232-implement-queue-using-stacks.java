class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;

    public MyQueue() {
        stack = new Stack<Integer>();
        temp = new Stack<Integer>();
    }

    public void push(int x) {
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

    }

    public int pop() {
        return stack.isEmpty() ? 0 : stack.pop();
    }

    public int peek() {
        return stack.isEmpty() ? 0 : stack.peek();
    }

    public boolean empty() {
        return stack.size() == 0 ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */