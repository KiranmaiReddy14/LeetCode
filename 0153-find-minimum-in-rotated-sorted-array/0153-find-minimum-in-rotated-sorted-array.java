class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = Math.min(min, nums[i]);
                index = i;
            }
            i++;
        }
        return min;
    }
}