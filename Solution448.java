class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<nums.length;i++){
           s.add(nums[i]);
        }
        for(int i=1; i<=nums.length;i++){
            if(!s.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
