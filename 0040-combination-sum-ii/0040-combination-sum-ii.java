class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = candidates.length;
        Arrays.sort(candidates);
        combinations(list, 0, candidates, target, new ArrayList<>());
        return list;
    }

    public void combinations(List<List<Integer>> list, int ind, int[] arr, int target, List<Integer> li) {
        if (target == 0) {
            list.add(new ArrayList<>(li));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > target)
                break;
            li.add(arr[i]);
            combinations(list, i + 1, arr, target - arr[i], li);
            li.remove(li.size() - 1);
        }
    }
}