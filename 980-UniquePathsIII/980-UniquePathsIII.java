// Last updated: 10/6/2025, 4:15:32 PM
class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int stx=0,sty=0,t=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    stx=i;
                    sty=j;
                }
                if(grid[i][j]==0){
                    t++;
                }
            }
        }
        return dfs(stx,sty,m,n,grid,0,t+1);
    }
    public int dfs(int i, int j, int m, int n, int[][]grid, int ct,int t){
        if(i<0 || j<0 || i>=m || j>=n){
            return 0;
        }
        if(grid[i][j]==-1) return 0;
        if(grid[i][j]==2){
            if(ct==t){
                return 1;
            }
            else{
                return 0;
            }
        }
        grid[i][j]=-1;
        int a=dfs(i+1,j,m,n,grid,ct+1,t);
        int b=dfs(i-1,j,m,n,grid,ct+1,t);
        int c=dfs(i,j+1,m,n,grid,ct+1,t);
        int d=dfs(i,j-1,m,n,grid,ct+1,t);
        grid[i][j]=0;

        return a+b+c+d;
    }
}