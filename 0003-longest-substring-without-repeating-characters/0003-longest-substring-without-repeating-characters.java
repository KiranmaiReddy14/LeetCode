class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        Set<Character> set = new HashSet<Character>();
        int maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            while (set.contains(c)) {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}