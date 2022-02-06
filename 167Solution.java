class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> m =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],i+1);
        }
        for(int i=0;i<nums.length;i++){
         int n = target-nums[i];
            if(m.containsKey(n)){
                return new int[]{i+1,m.get(n)};
            }   
        }
            
            
        return null;
    }
    
}
