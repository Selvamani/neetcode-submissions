class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int h = Arrays.stream(weights).sum();
        while(l<h) {
            int capacity = l + (h-l)/2;
            if(isFeasible(weights, days, capacity)) {
                h = capacity;
            } else {
                l = capacity+1;
            } 
        }
        return l;
    }

    private boolean isFeasible(int[] weights, int days, int capacity) {
        int load = 0, used = 1;
        for(int weight : weights) {
            if(load + weight > capacity) {
                used++; 
                load=0;
            } 
            load+=weight;
            if(used>days) {
                return false;
            }
        }
        return true;
    }
}