class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int n : nums)
            pq.add(n);
        while (!pq.isEmpty() && k > 0) {
            if (k == 1)
                return pq.poll();
            k--;
            pq.poll();
        }
        return 1;
    }
}