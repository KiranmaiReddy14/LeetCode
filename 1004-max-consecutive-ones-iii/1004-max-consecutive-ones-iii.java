class Solution {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int start = 0, max = Integer.MIN_VALUE, end = 0, count = 0;
        while (end < len) {
            if (nums[end] == 0)
                count++;
            while (start < len && count > k) {
                if (nums[start] == 0)
                    count--;
                start++;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}