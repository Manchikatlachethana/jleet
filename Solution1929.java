class Solution1929 {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int [] result = new int[len+len];
        for(int i=0; i<len;i++){
            result[i] = nums[i];
            result[i+len] = nums[i];
        }
        return result;
        
    }
}
