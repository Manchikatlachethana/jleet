class Solution3.1 {
    public int lengthOfLongestSubstring(String s) {
       int []charArr = new int[128];
        int left = 0;
        int right = 0;
        int result = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            charArr[c]++;
            while(charArr[c] > 1){
                char l = s.charAt(left);
                charArr[l]--;
                left++;
                
            }
            result = Math.max(result,right-left+1);
            right++;
        }
        return result;
    }
    
}
