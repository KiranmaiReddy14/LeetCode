class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count = (int) s.chars().filter(c -> c == '1').count();
        String res = "";
        if (count == 1)
            res = "0".repeat(s.length() - 1) + "1";
        else
            res = "1".repeat(count - 1) + "0".repeat(s.length() - count) + "1";
        return res;
    }
}