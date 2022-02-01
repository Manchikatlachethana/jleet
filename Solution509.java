/* Recursion--O(2^n)

class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}

*/

/* Bottom-up -- time:O(N)
class Solution {
    public int fib(int n) {
        
        if(n<=1) return n;
        int [] a = new int[n+1];
        a[1] = 1;
        for(int i=2;i<=n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }
}
*/

/* Iterative-Bottom up -- O(N)
class Solution {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }

        int current = 0;
        int prev1 = 1;
        int prev2 = 0;

        for (int i = 2; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }
}*/
