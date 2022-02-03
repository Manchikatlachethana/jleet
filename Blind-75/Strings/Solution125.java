class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        String str = "";
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str += c;
            }
        }        
        str = str.toLowerCase();
        int a = 0, b = str.length()-1;
        while(a <= b){
            if(str.charAt(a) != str.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
