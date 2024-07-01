class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
        System.out.println(Arrays.toString(nums));

        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j])
                list.add(nums[j]);
        }
        return list;
    }
}