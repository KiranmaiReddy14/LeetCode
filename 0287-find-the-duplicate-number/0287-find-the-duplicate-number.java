class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[index] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                return nums[j];
        }
        return i;
    }
}