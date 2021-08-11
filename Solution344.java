class Solution344 {
    public void reverseString(char[] s) {
        char temp = 'a';
        int n = s.length-1;
        for(int i=0;i<=n/2;i++){
            temp = s[n-i];
            s[n-i] = s[i];
            s[i] = temp;
        }
       
    }
}
