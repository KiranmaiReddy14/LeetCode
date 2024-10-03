class Solution {
    public int singleNumber(int[] nums) {
        int missing = 0;
        for (int i : nums)
            missing ^= i;
        return missing;
    }
}