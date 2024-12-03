class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for (int space : spaces) {
            sb.append(s, start, space).append(" ");
            start = space;
        }
        sb.append(s.substring(start));
        return sb.toString();
    }
}