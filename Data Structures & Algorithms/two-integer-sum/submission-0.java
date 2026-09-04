class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>(){};
         for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer index = complementMap.get(complement);            
            if (index != null) {
                return new int[]{index, i};
            }
            
            complementMap.put(nums[i], i);
         }
         return new int[0];
    }
}
