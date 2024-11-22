class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int n = list.size();
            for (int j = 0; j < n; j++) {
                List<Integer> li = new ArrayList<>(list.get(j));
                li.add(nums[i]);
                if (!list.contains(li))
                    list.add(li);
            }
        }
        return list;
    }
}