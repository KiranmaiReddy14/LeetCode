
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, new ArrayList<>(), list, new boolean[nums.length]);
        return list;
    }

    public void backtrack(int[] nums, List<Integer> li, List<List<Integer>> list, boolean[] used) {
        if (li.size() == nums.length) {
            list.add(new ArrayList<>(li));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                    continue;
                used[i] = true;
                li.add(nums[i]);
                backtrack(nums, li, list, used);
                used[i] = false;
                li.remove(li.size() - 1);
            }
        }
    }
}