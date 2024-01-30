class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            int res = 0;
            if (isNumber(s))
                stack.push(Integer.parseInt(s));
            else {
                if (!stack.isEmpty()) {
                    int b = stack.pop(), a = stack.pop();
                    if (s.equals("+")) res = a + b;
                    else if (s.equals("-")) res = a - b;
                    else if (s.equals("*")) res = a * b;
                    else if (s.equals("/")) res = a / b;
                }
                stack.push(res);
            }
        }
        return stack.peek();
    }

    public boolean isNumber(String s) {
        try {
            int n = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}