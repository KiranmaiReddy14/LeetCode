class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str1 = trimString(s);
        String str2 = trimString(t);
        if (str1.equalsIgnoreCase(str2))
            return true;
        return false;
    }

    public static String trimString(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#' && !res.isEmpty()) {
                int len = res.length();
                if (len > 0)
                    res.deleteCharAt(len - 1);
            } else if (ch == '#' && res.isEmpty()) {
                continue;
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}