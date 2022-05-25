class Solution {
    
    private int getNext(int n){
        int total = 0;
        while(n>0){
            int d = n%10;
            n=n/10;
            total=total+d*d;
        }
        return total;
    }
    
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=getNext(n);
        }
        return n==1;
    }
}
