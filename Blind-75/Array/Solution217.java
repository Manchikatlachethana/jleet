//USING MAP

class Solution {
    public boolean containsDuplicate(int[] nums) {
  
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(!m.containsKey(nums[i])){
                m.put(nums[i], 1);
            }
            else{
                m.put(nums[i], m.get(nums[i])+1);
            }
        }
      
        for(Map.Entry<Integer,Integer> map:m.entrySet()){
            
            if(map.getValue()>1){
            return true;
            }
            
        }
        return false;
    }
}
