class Solution7 {
    public int reverse(int x) {
        int rev = 0;
        while(x!=0){
        int d = x%10;
        rev = rev*10+d;
            x=x/10;;  
        }
        return rev;
        
    }
}
