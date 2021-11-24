class Solution {
    public int missingNumber(int[] nums) {
        int result = -1;
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            s.add(nums[i]);  
        }
        for(int i=0;i<nums.length+1;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        
        return -1;
    }
}
