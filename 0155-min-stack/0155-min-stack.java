class MinStack {
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        if (stack.isEmpty())
            System.out.println("Stack Full");
        stack.pop();
    }

    public int top() {
        if (stack.isEmpty())
            return 0;
        return stack.peek();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int num : stack) {
            if (num < min)
                min = num;
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */