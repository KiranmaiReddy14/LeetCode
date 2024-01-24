class Solution {
    public int longestBeautifulSubstring(String word) {
        int j = 0;
        char[] vo = { 'a', 'e', 'i', 'o', 'u' };
        int count = 0;
        int max = 0;
        int len=vo.length;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == vo[j])
                count++;
            else if (j < len - 1 && count > 0 && word.charAt(i) == vo[j + 1]) {
                j++;
                count++;
            } else if (word.charAt(i) != vo[j]) {
                if (j == len - 1)
                    max = Math.max(max, count);
                j = 0;
                count = 0;
                if (word.charAt(i) == vo[j])
                    count++;
            }
        }
        if (j == len - 1)
            max = Math.max(max, count);
        return max;
    }
}