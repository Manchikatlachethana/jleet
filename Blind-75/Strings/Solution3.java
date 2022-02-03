class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0, b = 0, max = 0;
        Set<Character> hs = new HashSet();
        while(b < s.length()){
            if(!hs.contains(s.charAt(b))){
                hs.add(s.charAt(b));
                b++;
                max = Math.max(hs.size(), max);
            }else{
                hs.remove(s.charAt(a));
                a++;
            }
        }
        
        return max;
    }
}
