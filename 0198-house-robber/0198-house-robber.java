class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        return Math.max(getMaxRobbed(nums, 0, n - 1), getMaxRobbed(nums, 1, n - 1));
    }

    public static int getMaxRobbed(int[] nums, int start, int end) {
        int prev = 0;
        int max = 0;
        for (int i = start; i <= end; i++) {
            int robb = Math.max(max, prev + nums[i]);
            prev = max;
            max = robb;
        }
        return max;
    }
}