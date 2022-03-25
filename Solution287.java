class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> uniq = new HashSet<>();
        for(int i:nums){
            if(uniq.contains(i)){
                return i;
            }
            uniq.add(i);
        }
        return -1;
    }
}
