class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    callDfs(grid,i,j);
                }
            }
        }
        return count;
    }
    
    private void callDfs(char[][] grid, int i, int j){
        if(i<0 ||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0' )           {
            return;
        }
        //make '1' to '0'
        grid[i][j]='0';
        callDfs(grid,i-1,j);//up
        callDfs(grid,i+1,j);//down
        callDfs(grid,i,j-1);//left
        callDfs(grid,i,j+1);//right
    }
}
