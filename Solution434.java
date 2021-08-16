class Solution434 {
    public int countSegments(String s) {
        int count = 0;
        if(s.length()==0) return 0;
        else{
            
        for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == ' '){
            count++;
        }
        }
        if(count>0){
        return count+1;
        }
        else return 1;
        }
    }
}
