class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] maxScore = new int[n][2];
        for (int i = 0; i < n; i++)
            maxScore[i] = new int[] { nums2[i], nums1[i] };
        Arrays.sort(maxScore, (a, b) -> (b[0] - a[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> (a - b));
        long r = 0, sum = 0;
        for (int[] res : maxScore) {
            pq.add(res[1]);
            sum = (sum + res[1]);
            if (pq.size() > k)
                sum -= pq.poll();
            if (pq.size() == k)
                r = Math.max(r, sum * res[0]);
        }
        return r;
    }
}