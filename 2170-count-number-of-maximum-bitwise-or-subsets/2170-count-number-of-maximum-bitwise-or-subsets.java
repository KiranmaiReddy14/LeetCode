class Solution {
    private int result = 0;
    private int max = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int n : nums)
            max |= n;
        backtrack(nums, 0, 0);
        return result;
    }

    public void backtrack(int[] nums, int start, int val) {
        if (val == max)
            result++;
        for (int i = start; i < nums.length; i++) {
            backtrack(nums, i + 1, val | nums[i]);
        }
    }
}