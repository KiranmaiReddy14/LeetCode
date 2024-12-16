class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int ind = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    ind = i;
                    min = nums[i];
                }
            }
            nums[ind] = nums[ind] * multiplier;
            k--;
        }
        return nums;
    }
}