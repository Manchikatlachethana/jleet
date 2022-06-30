class Solution {
    public int islandPerimeter(int[][] grid) {
        int result=0;
        /*
        traverse each cell on the grid, and if reached a land cell then consider perimeter as 4 and add to result.
        If the current land cell has a UP land cell, subtract 2 from  result.
        If the current land cell has a LEFT land cell, subtract 2 from the result.
        */
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 1){
                    result += 4;
                //up cell
                    if(i>0 && grid[i-1][j] == 1){
                        result -= 2;
                    }
                //left cell
                    if(j>0 && grid[i][j-1] == 1){
                        result -= 2;
                    }
                }
            }
        }
        return result;
    }
}
