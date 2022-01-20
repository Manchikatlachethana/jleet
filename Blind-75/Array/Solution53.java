class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int curmax = 0;
            for(int j=i; j<nums.length; j++){
              curmax = curmax + nums[j];
              max = Math.max(max, curmax);  
            }  
        }
        return max;
    }
}
