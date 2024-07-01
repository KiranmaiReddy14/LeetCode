class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < nums.length) {
            int sIndex = nums[i] - 1;
            if (nums[i] != nums[sIndex]) {
                int temp = nums[i];
                nums[i] = nums[sIndex];
                nums[sIndex] = temp;
            } else
                i++;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < len; j++) {
            if (j + 1 != nums[j])
                list.add(j + 1);
        }
        return list;
    }
}