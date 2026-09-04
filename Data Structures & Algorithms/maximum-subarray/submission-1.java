class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], current = 0;
        for (int num : nums) {
            if(current < 0) {
                current = 0;
            }
            current += num;
            maxSum = Math.max(current, maxSum);
        }
        return maxSum;
    }
}
