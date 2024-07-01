class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                return new int[] { nums[j], j + 1 };
        }
        return new int[] { 1, 1 };
    }
}