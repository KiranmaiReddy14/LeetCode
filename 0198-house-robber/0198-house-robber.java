class Solution {
    public int rob(int[] nums) {
        int size = nums.length;
        if (size == 0)
            return size;
        else if (size == 1)
            return nums[0];
        else if (size == 2)
            return Math.max(nums[0], nums[1]);
        int[] n = new int[size];
        n[0] = nums[0];
        n[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < size; i++)
            n[i] = Math.max(n[i - 1], n[i - 2] + nums[i]);
        return n[size - 1];
    }
}