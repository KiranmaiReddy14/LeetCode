class Solution {
    public String addSpaces(String s, int[] spaces) {
        if (s.isEmpty())
            return s;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < spaces.length && j < s.length()) {
            if (j == spaces[i]) {
                sb.append(" ");
                i++;
            }
            sb.append(s.charAt(j));
            j++;
        }
        while (j < s.length()) {
            sb.append(s.charAt(j));
            j++;
        }
        return sb.toString();
    }
}