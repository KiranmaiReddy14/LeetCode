class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int n : nums)
            pq.add(n);
        while (!pq.isEmpty()) {
            int res = pq.poll();
            k--;
            if (k == 0)
                return res;
        }
        return k;
    }
}