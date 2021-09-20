
class Solution3{
public int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(repetition(s,i,j)){
                    result = Math.max(result,j-i+1); 
                }
                
            }
            }
        return result;
        }
    
    public boolean repetition(String s,int start,int end){
        int [] charArr = new int[128];
        for(int i = start; i <= end; i++){
            char c = s.charAt(i);
            charArr[c]++;
            if(charArr[c] > 1){
                return false;
            }
        }
        return true;
    }
    
    }
