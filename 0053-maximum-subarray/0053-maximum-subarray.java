class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int sum = nums[0];
        int max_sum = sum;
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i] + sum, nums[i]);
            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;
    }
}