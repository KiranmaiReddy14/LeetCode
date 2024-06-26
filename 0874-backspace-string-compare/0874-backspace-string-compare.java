class Solution {
    public boolean backspaceCompare(String s, String t) {
        String left = "";
        String right = "";
        for (int i = 0, j = 0; i < s.length() || j < t.length(); i++, j++) {
            if (i < s.length()) {
                if (s.charAt(i) == '#' && left.length() > 0)
                    left = left.substring(0, left.length() - 1);
                else {
                    if (s.charAt(i) != '#')
                        left += s.charAt(i) + "";
                }
            }
            if (j < t.length()) {
                if (t.charAt(j) == '#' && right.length() > 0)
                    right = right.substring(0, right.length() - 1);
                else {
                    if (t.charAt(j) != '#')
                    right += t.charAt(j) + "";
                }
            }
        }
        System.out.println(left + " " + right);
        return left.equals(right) ? true : false;
    }
}