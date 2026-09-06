class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, max = 0;
        for(int j = 1; j < prices.length; j++) {
            if(prices[i] < prices[j]) {
                max = Math.max(max, prices[j]-prices[i]);
            } else {
                i = j;
            }
        }
        return max;
    }
}
