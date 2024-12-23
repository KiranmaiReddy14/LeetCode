class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (left <= right && sum >= target) {
                min = Math.min(min, right - left + 1);
                sum -= nums[left++];
            }
            right++;
        }
        return min > nums.length ? 0 : min;
    }
}