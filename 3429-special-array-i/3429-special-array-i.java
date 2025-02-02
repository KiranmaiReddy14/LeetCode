class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if (n < 2)
            return true;
        for (int i = 0; i < n - 1; i++) {
            if (((nums[i] & 1) == 0 && (nums[i + 1] & 1) == 1) ||
                    ((nums[i] & 1) == 1 && (nums[i + 1] & 1) == 0))
                continue;
            return false;
        }
        return true;
    }
}