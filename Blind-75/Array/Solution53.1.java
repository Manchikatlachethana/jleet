//DP-KADANE'S ALGO
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curmax = nums[0];
        for(int i=1; i<nums.length; i++){            
            int value = nums[i];
              curmax = Math.max(value, curmax + value);
              max = Math.max(max, curmax);  
            
        }
        return max;
    }
}
