class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        return Math.max(maxRobbed(nums, 0, n), maxRobbed(nums, 1, n));
    }

    public int maxRobbed(int[] nums, int start, int n) {
        int prev = 0;
        int max = 0;
        for (int i = start; i < n; i++) {
            int curr = Math.max(max, prev + nums[i]);
            prev = max;
            max = curr;
        }
        return Math.max(prev, max);
    }
}