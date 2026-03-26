// Last updated: 3/26/2026, 11:44:35 AM
1class Solution {
2    public int maxAreaOfIsland(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int max=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(grid[i][j]==1){
9                    int area=dfs(grid,i,j);
10                    max=Math.max(max,area);
11                }
12            }
13        }
14        return max;
15    }
16    public static int dfs(int[][]grid, int i ,int j){
17        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
18            return 0;
19        }
20        grid[i][j]=0;
21        int ans=1;
22        ans+=dfs(grid,i+1,j);
23        ans+=dfs(grid,i-1,j);
24        ans+=dfs(grid,i,j+1);
25        ans+=dfs(grid,i,j-1);
26        return ans;
27    }
28}