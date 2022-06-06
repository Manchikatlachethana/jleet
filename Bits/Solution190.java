public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int sol=0;
        int p=31;        
        while(p!=0){
           int k=n&1;
           sol = (sol+k)*2;
            n=n>>1;
            p--;
        }                
       if((n&1)==1){
           return sol+1;
       }
       return sol; 
    }
}
