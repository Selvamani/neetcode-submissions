class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev = 0, curr = 0;
        for(int i=2; i<=cost.length; i++) {
            int next = Math.min(cost[i-1] + curr, prev + cost[i-2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }
}
