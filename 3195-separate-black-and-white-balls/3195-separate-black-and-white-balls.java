class Solution {
    public long minimumSteps(String s) {
        long whites = 0;
        long swaps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                swaps += (long) whites;
            else
                whites++;
        }
        return swaps;
    }
}