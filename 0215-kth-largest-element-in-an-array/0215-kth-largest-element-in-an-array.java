class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        for (int n : nums)
            pq.add(n);
        int num = 0;
        while (k > 0) {
            num = pq.poll();
            k--;
        }
        return num;
    }
}