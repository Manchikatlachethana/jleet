class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int s = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<s && diff!=0; i++){
            int l=i+1;
            int h=s-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff=target-sum;
                }
                if(sum<target){
                    l++;
                }
                else{
                    h--;
                }
            }
        }
        return target-diff;
    }
