class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 = sortArray(s.toCharArray());
        String str2 = sortArray(t.toCharArray());
        if (str1.equalsIgnoreCase(str2))
            return true;
        return false;
    }

    private String sortArray(char[] ch) {
        Arrays.sort(ch);
        return new String(ch);
    }
}