class Solution13 {
    int value(char c){
        if(c=='I') return 1;
         if(c=='V') return 5;
         if(c=='X') return 10;
         if(c=='L') return 50;
         if(c=='C') return 100;
         if(c=='D') return 500;
         if(c=='M') return 1000;
        return -1;
        
        
    }
    public int romanToInt(String s) {
        int result = 0;
        for(int i = 0,j=i+1;i<s.length() && j<i;i++,j++){
            int s1 = value(s.charAt(i));
            int s2 = value(s.charAt(j));
            if(s1>=s2){
                result += s1;
            }
            else{
                result += s2-s1;
            }
        }
        
       return result; 
    }
}
