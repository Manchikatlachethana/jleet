//o(n^2)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        for(int i=0;i<n;i++){
            int total=0, stopcount=0, j=i;
            while(stopcount<n){
                total = total+gas[j%n]-cost[j%n];
                if(total<0){
                    break;
                }
                stopcount++;
                j++;
            }
            if(stopcount == n && total>=0){
                return i;
            }
        }
        return -1;
    }
}

//o(n)

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank=0,index=0, total=0;
        int n = gas.length;
        for(int i=0;i<n;i++){
            int consume = gas[i]-cost[i];
            tank = tank+consume;
            if(tank<0){
                index = i+1;
                tank=0;
            }
            total = total+consume;
        }
        
        if(total<0){
            return -1;
        }
        return index;
    }
}
