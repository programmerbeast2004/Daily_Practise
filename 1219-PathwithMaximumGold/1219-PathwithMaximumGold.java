// Last updated: 10/6/2025, 10:46:36 AM
class Solution {
    int grid[][];
    int m,n;
    int maxGold=0;
    public int getMaximumGold(int[][] grid) {
        this.grid=grid;
        this.m=grid.length;
        if(m==0) return 0;
        this.n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    dfs(i,j,0);
                }
            }
        }
        return maxGold;
    }
    public void dfs(int i,int j, int currGold){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==0){
            return;
        }
        int gold=grid[i][j];
        currGold+=gold;
        maxGold=Math.max(maxGold,currGold);
        grid[i][j]=0;
        dfs(i+1, j,currGold);
        dfs(i-1,j,currGold);
        dfs(i,j+1,currGold);
        dfs(i,j-1,currGold);
        grid[i][j]=gold;
    }
}