class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int seq = 1;
        int count = 1;
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == first)
                continue;
            else if (nums[i] == (first + 1)) {
                seq++;
                first = nums[i];
            } else {
                count = seq > count ? seq : count;
                seq = 1;
                first = nums[i];
            }
        }
        count = Math.max(count, seq);
        return count;
    }
}