class Solution {
    int len = 0;
    int low = 0;

    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        int i = 0;
        int j = s.length() - 1;
        while (i < s.length() - 1) {
            isPalindrome(s, i, i);
            isPalindrome(s, i, i + 1);
            i++;
        }
        System.out.println(low + "   " + len);
        return s.substring(low, low + len);
    }

    public boolean isPalindrome(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (j - i - 1 > len) {
            len = j - i - 1;
            low = i + 1;
        }
        return true;
    }
}