class Solution {
    public int minimumCost(int[] cost) {       
        if(cost.length == 1){
            return cost[0];
        }
        if(cost.length == 2){
            return cost[0]+cost[1];
        }
        int mincost = 0;
        int count = 0;
        Arrays.sort(cost);
        for(int i=cost.length-1;i>=0;i--){
            if(count<2){
                mincost = mincost+cost[i];
                count++;
            }else{
                count = 0;
            }
        }
        return mincost;       
    }
}
