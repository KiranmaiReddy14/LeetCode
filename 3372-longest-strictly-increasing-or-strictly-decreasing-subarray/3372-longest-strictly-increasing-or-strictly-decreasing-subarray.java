class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n;
        int max = 1;
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                count++;
                continue;
            }
            max = Math.max(max, count);
            count = 1;
        }
        max = Math.max(max, count);
        count = 1;
        // for decreased nums
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                continue;
            }
            max = Math.max(max, count);
            count = 1;
        }
        max = Math.max(max, count);
        return max;
    }
}