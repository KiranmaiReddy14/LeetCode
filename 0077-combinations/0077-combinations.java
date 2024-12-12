class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        backtrack(list, li, n, k, 1);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> li, int n, int k, int s) {
        if (li.size() == k) {
            list.add(new ArrayList<>(li));
            return;
        }
        for (int i = s; i <= n; i++) {
            li.add(i);
            backtrack(list, li, n, k, i + 1);
            li.remove(li.size() - 1);
        }
    }
}