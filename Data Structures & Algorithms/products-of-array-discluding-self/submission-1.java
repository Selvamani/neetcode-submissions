class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1, zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) {
                product *= nums[i];
            } else {
                zeroCount++;
            }
        }
        if(zeroCount > 1) {
            return new int[nums.length];
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(zeroCount == 0) {
                result[i] = product/nums[i];
            } else {
                result[i] = nums[i] == 0 ? product : 0;
            }
        }
        return result;
    }
}  
