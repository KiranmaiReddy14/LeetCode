class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : words)
            map.put(s, map.getOrDefault(s, 0) + 1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return a.compareTo(b); // Lexicographical order
            }
            return freqB - freqA; // Higher frequency comes first
        });
        
        // Step 3: Add all words to the priority queue
        pq.addAll(map.keySet());
        
        // Step 4: Extract top K frequent words
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }
        
        return result;
    }
}