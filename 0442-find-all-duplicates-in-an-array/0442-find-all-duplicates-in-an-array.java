class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while (i < nums.length) {
            int n = nums[i] - 1;
            if (nums[n] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                list.add(nums[j]);
        }
        return list;
    }
}