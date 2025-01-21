class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0]-a[0]);
        for(Map.Entry<Integer, Integer> m : map.entrySet())
            pq.add(new int[]{m.getValue(), m.getKey()});
        int[] res=new int[k];
        int i = 0;
        while(k > 0) {
            res[i] = pq.poll()[1];
            i++;
            k--;
        }
        return res;
    }
}