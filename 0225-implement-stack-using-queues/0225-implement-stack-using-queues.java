class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        for (int i = 0; i < queue.size() - 1; i++)
            queue.offer(queue.poll());
    }

    public int pop() {
        return queue.isEmpty() ? 0 : queue.poll();
    }

    public int top() {
        return queue.isEmpty() ? 0 : queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty() ? true : false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */