class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sqrs = new int[n];
        for (int i = 0; i < n; i++)
            sqrs[i] = nums[i] * nums[i];
        Arrays.sort(sqrs);
        return sqrs;
    }
}