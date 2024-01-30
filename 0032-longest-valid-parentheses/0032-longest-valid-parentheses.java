class Solution {
    public int longestValidParentheses(String s) {
        if (s.length() == 0)
            return 0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty())
                    count = Math.max(count, i - stack.peek());
                else
                    stack.push(i);
            }
        }
        return count;
    }
}