class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        //System.out.println(s);
        for(int i=0;i<nums.length+1;i++){
            if(!s.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
