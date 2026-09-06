class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi=Arrays.stream(piles).max().getAsInt();
        while(lo<hi) {
            int k = lo + (hi-lo)/2;
            int totalTime = 0;
            for(int pile: piles) {
                totalTime += Math.ceil((double) pile/k);
            }
            if(totalTime <= h) {
                hi=k;
            } else {
                lo=k+1;
            }
        }
        return lo;
    }
}
