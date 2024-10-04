class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int seq = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            else if (nums[i] == (nums[i - 1] + 1)) {
                seq++;
            } else {
                count = Math.max(seq, count);
                seq = 1;
            }
        }
        count = Math.max(count, seq);
        return count;
    }
}