class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int max = 0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue() > nums.length/2){
                max =  e.getKey();            
            }
        }
        return max;
    }
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
*/
