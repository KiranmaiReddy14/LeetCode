class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        if (costs.length == 1)
            return costs[0];
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        long sum = 0;
        int l = 0;
        int r = costs.length - 1;
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
                sum += left.poll();
            else
                sum += right.poll();
            k--;
        }
        while (k > 0 && (!left.isEmpty() || !right.isEmpty())) {
            if (!left.isEmpty() && (right.isEmpty() || left.peek() <= right.peek()))
                sum += left.poll();
            else
                sum += right.poll();
            k--;
        }
        return sum;
    }
}