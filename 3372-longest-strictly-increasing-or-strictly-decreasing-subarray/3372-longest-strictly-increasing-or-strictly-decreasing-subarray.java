class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n;
        int max = 1;
        int inc = 1, dec = 1;
        for (int i = 1; i < n; i++) {
            // if it's in increasing order increment inc variable
            // as it's incrementing make dec as 1
            if (nums[i] > nums[i - 1]) {
                inc++;
                dec = 1;
            } else if (nums[i] < nums[i - 1]) {
                dec++;
                inc = 1;
            }
            // if the values are same reset both the variables
            else {
                inc = 1;
                dec = 1;
            }
            max = Math.max(inc, Math.max(max, dec));
        }
        return max;
    }
}