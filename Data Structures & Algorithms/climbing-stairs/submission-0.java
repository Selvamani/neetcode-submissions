class Solution {
    public int climbStairs(int n) {
        int prev = 1, curr = 1;
        for(int i=2; i<=n; i++) {
            int t = prev + curr;
            prev = curr;
            curr = t;
        }
        return curr;
    }
}
