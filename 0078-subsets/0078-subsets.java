class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = 0;
            if (i > 0 && nums[i] == nums[i - 1])
                start = end + 1;
            end = list.size() - 1;
            int n = list.size();
            for (int j = start; j < n; j++) {
                List<Integer> li = new ArrayList<>(list.get(j));
                li.add(nums[i]);
                list.add(li);
            }
        }
        return list;
    }
}