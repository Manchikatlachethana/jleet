class Solution11.1 {
    public int maxArea(int[] height) {
        int maxarea = 0, left = 0, right = height.length-1;
        while(left < right){
            maxarea = Math.max(maxarea,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}
