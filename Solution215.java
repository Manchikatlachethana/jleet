//O(nlogn)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length<k || nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<nums.length;i++){
           count++;
            if(count==nums.length-k+1){
                return nums[i];
            }
        }
        return 0;
    }
}



//O(nlogk)
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
