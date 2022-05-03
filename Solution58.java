class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length()-1;
        while(index>=0 && s.charAt(index) == ' '){
            index--;
        }
        int len = 0;
        while(index>=0 && s.charAt(index) != ' '){
            index--;
            len++;
        }
        return len;
    }
}
