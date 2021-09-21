class Solution1.1 {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap <> ();
        for(int i = 0;i < nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int j = target - nums[i];
        if(map.containsKey(j) && map.get(j)!= i){
            return new int [] {i,map.get(j) };
        }
        }
      return null;  
    }
}
