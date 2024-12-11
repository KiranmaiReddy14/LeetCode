class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), list, 0);
        return list;
    }

    public void backtrack(int[] candidates, int target, List<Integer> li, List<List<Integer>> list, int index) {
        if (target == 0) {
            list.add(new ArrayList<>(li));
            return;
        }
        if (target < 0)
            return;
        for (int i = index; i < candidates.length; i++) {
            li.add(candidates[i]);
            backtrack(candidates, target - candidates[i], li, list, i);
            li.remove(li.size() - 1);
        }
    }
}