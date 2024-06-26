class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            int cn = 0;
            while (n > 0) {
                cn++;
                n = n / 10;
            }
            if (cn % 2 == 0)
                count++;
        }
        return count;
    }
}