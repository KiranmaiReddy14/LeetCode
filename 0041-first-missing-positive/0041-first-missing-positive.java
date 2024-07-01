class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                return j + 1;
        }
        return i + 1;
    }
}