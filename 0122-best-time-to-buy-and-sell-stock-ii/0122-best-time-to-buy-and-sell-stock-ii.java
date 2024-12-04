class Solution {
    public int maxProfit(int[] prices) {
        int sell = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int buy = prices[i + 1] - prices[i];
            if (buy > 0)
                sell += buy;
        }
        return sell;
    }
}