class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 0;
        while (i < prices.length - 1) {
            for (int j = i + 1; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                max = diff > max ? diff : max;
            }
            i++;
        }
        return max;
    }
}