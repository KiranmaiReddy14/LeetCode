class Solution {
    public int minimumLength(String s) {
        int i = 0, j = s.length() - 1;
        String res = "";
        char left = s.charAt(i);
        while (i < j && s.charAt(i) == s.charAt(j)) {
            left = s.charAt(i);
            while (i <= j && left == s.charAt(i))
                i++;
            while (j >= i && left == s.charAt(j))
                j--;
        }
        return j - i + 1;
    }
}