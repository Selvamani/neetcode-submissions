class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, h=nums.length;
        while(l<h) {
            int mid = l+(h-l)/2;
            if(nums[mid] >= target) {
                h=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
}