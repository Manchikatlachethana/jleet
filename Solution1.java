class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int []res = new int[nums.length];
        for(int i=0,j=i+1;i<nums.length&&j<i;i++,j++){
                if(nums[i]+nums[j]==target){
                    res[i]=nums[i];
                    res[j]=nums[j]; 
                }
        }
        /*for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+"");
        }*/
        return res;
    }
}
