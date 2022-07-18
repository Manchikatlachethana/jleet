class Solution {
    public int characterReplacement(String s, int k) {
       if(s == null || s.length() == 0 || k > s.length()) return -1;
        
        Map<Character,Integer> map = new HashMap<>();
        int maxlen = 0,start = 0, end = 0, count = 0;
        while(end<s.length()){
            char curr = s.charAt(end);
            map.put(curr,map.getOrDefault(curr,0)+1);
            count = Math.max(count,map.get(curr));
            
            if(end-start+1-count>k){
                //differnt characters > k
                char schar = s.charAt(start);
                map.put(schar,map.get(schar)-1);
                start++;                
            }
            maxlen = Math.max(maxlen,end-start+1);//(maxlen,window)
            end++;
        }
        return maxlen;
    }
}
