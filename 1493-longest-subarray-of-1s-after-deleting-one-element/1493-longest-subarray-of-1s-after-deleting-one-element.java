class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int max = 0;
        int zeros = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                zeros++;
            while (zeros > 1) {
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
}