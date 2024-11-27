class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        if (n == 1)
            return costs[0];
        int l = 0;
        int r = n - 1;
        long cost = 0;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        while (l <= r && k > 0) {
            while (left.size() < Math.min(candidates, costs.length / 2)) {
                left.add(costs[l]);
                l++;
            }
            while (right.size() < Math.min(candidates, costs.length / 2)) {
                right.add(costs[r]);
                r--;
            }
            if (!left.isEmpty() && left.peek() <= right.peek())
                cost += left.poll();
            else
                cost += right.poll();
            k--;
        }
        while (k > 0 && (!left.isEmpty() || !right.isEmpty())) {
            if (!left.isEmpty() && (right.isEmpty() || left.peek() <= right.peek()))
                cost += left.poll();
            else
                cost += right.poll();
            k--;
        }
        return cost;
    }
}