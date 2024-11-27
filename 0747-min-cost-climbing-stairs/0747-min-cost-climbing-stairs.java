class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0)
            return 0;
        if (n == 1)
            return cost[0];
        int first = cost[0];
        int second = cost[1];
        if (n <= 2)
            return Math.min(first, second);
        for (int i = 2; i < n; i++) {
            int min = cost[i] + Math.min(first, second);
            first = second;
            second = min;
        }
        return Math.min(first, second);
    }
}