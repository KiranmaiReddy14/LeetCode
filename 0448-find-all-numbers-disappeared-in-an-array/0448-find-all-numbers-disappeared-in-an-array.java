class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        boolean[] missing = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++)
            missing[nums[i] - 1] = true;
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j < nums.length; j++) {
            if (!missing[j])
                list.add(j + 1);
        }
        return list;
    }
}