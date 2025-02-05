class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return n == 0 ? 0 : nums[0];
        int sum = nums[0];
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
                max = Math.max(max, sum);
            } else {
                max = Math.max(max, sum);
                sum = nums[i];
            }
        }
        max = Math.max(max, sum);
        return max;
    }
}