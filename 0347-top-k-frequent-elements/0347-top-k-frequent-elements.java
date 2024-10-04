class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        List<Integer>[] list = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int fre = m.getValue();
            if (list[fre] == null)
                list[fre] = new ArrayList<>();
            list[fre].add(m.getKey());
        }
        List<Integer> li = new ArrayList<>();
        for (int j = list.length - 1; j >= 0 && li.size() < k; j--) {
            if (list[j] != null) {
                li.addAll(list[j]);
            }
        }
        return li.stream().mapToInt(i -> i).toArray();
    }
}