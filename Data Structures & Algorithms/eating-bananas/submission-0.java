class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = 0;
        for(int pile : piles){
            maxSpeed = Math.max(maxSpeed, pile);
        }
        int low = 1;
        int high = maxSpeed;
        int result = high;
        while(low<=high) {
            int k = low + (high - low)/2;
            long timeTaken = 0;
            for (int pile:piles) {
                timeTaken += Math.ceil((double)pile/k);
            }
            if(timeTaken<=h) {
                result = k;
                high = k-1;
            } else {
                low = k+1;
            }
        }
        return result;
    }
}
