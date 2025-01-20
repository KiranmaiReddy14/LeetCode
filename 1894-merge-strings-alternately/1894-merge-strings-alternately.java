class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        while (i < len1 || j < len2) {
            if (i < len1)
                sb.append(word1.charAt(i++));
            if (j < len2)
                sb.append(word2.charAt(j++));
        }
        while (i < len1)
            sb.append(word1.charAt(i++));
        while (j < len2)
            sb.append(word2.charAt(j++));
        return sb.toString();
    }
}