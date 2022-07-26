class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int val = nums[i];
            while(i+1 < nums.length && nums[i+1] == nums[i]+1){
                i++;
            }
            if(val != nums[i]){
                res.add(val+"->"+nums[i]);
            }else{
                res.add(""+val);
            }
        }
        return res;
    }
}
