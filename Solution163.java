class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        int prev=lower-1;
        for(int i=0;i<=nums.length;i++){
            int curr=0;
            if(i<nums.length){
                curr=nums[i];
            }else{
                curr=upper+1;
            }
            if(prev+1<=curr-1){
                res.add(range(prev+1,curr-1));
            }
            prev=curr;
        }
        return res;
    }
    
    private String range(int lower,int upper){
        if(lower==upper){
            return String.valueOf(lower);
        }
        return lower+"->"+upper;
    }
}
