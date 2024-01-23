class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        int len = strs.length;
        String first = strs[0];
        String last = strs[len - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i))
                return sb.toString();
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}