class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), list);
        return list;
    }

    public void backtrack(int[] nums, List<Integer> li, List<List<Integer>> list) {
        if (li.size() == nums.length) {
            list.add(new ArrayList<>(li));

        } else {
            for (int i = 0; i < nums.length; i++) {
                if(li.contains(nums[i]))
                continue;
                li.add(nums[i]);
                backtrack(nums, li, list);
                li.remove(li.size() - 1);
            }
        }
    }
}