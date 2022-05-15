class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i:nums){
            if(!l.contains(i)){
                l.add(i);
            }else{
                l.remove(new Integer(i));
            }
        }
        return l.get(0);
    }
}
