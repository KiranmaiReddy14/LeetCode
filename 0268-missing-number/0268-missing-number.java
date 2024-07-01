class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int len = nums.length;
        while (i < len) {
            int index = nums[i];
            if (nums[i] < len && i != index) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            } else
                i++;
        }
        for (int j = 0; j < len; j++) {
            if (j != nums[j])
                return j;
        }
        return len;
    }
}