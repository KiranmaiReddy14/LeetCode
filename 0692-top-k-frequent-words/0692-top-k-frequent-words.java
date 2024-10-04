class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words)
            map.put(s, map.getOrDefault(s, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int fa = map.get(a);
            int fb = map.get(b);
            if (fa == fb) {
                return a.compareTo(b);
            }
            return fb - fa;
        });
        pq.addAll(map.keySet());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        return result;
    }
}