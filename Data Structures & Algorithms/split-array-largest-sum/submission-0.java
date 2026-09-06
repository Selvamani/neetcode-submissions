class Solution {
    public int splitArray(int[] nums, int k) {
        int l = Arrays.stream(nums).max().getAsInt();
        int h = Arrays.stream(nums).sum();
        while(l<h) {
            int threshold = l + (h-l)/2;
            if(canSplit(nums, k, threshold)) {
                h = threshold;
            } else {
                l = threshold+1;
            }
        }
        return l;
    }
    
    private boolean canSplit(int[] nums, int k, int threshold) {
        int sum=0, split=1; 
        for(int num : nums) {
            if(sum+num> threshold) {
                split++;
                sum=0;
            }
            sum+=num;
            if(split>k) {
                return false;
            }
        }
        return true;
    }
}