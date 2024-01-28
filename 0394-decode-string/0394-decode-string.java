class Solution {
    public String decodeString(String s) {
        Stack<Integer> numbers = new Stack<>();
        Stack<String> stack = new Stack<>();
        String res = "";
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + c - '0';
            } else if (c == ']') {
                String str = "";
                while (!stack.isEmpty() && !stack.peek().equals("["))
                    str = stack.pop() + str;
                if (!stack.isEmpty() && stack.peek().equals("["))
                    stack.pop();
                int count = 0;
                if (!numbers.isEmpty())
                    count = numbers.pop();

                res = "";
                for (int i = 0; i < count; i++)
                    res += str;
                stack.push(res);
            } else {
                if (k > 0)
                    numbers.push(k);
                k = 0;
                stack.push(c + "");
            }
        }
        res = "";
        while (!stack.isEmpty())
            res = stack.pop() + res;
        return res;
    }
}