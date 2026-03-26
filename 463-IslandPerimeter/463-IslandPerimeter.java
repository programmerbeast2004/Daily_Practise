// Last updated: 3/26/2026, 11:06:31 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int m=grid.length;
4        int n=grid[0].length;
5        int p=0;
6        for(int i=0;i<m;i++){
7            for(int j=0;j<n;j++){
8                if(grid[i][j]==1){
9                if(i==0 ||grid[i-1][j]==0)p++;
10                if(i==m-1 || grid[i+1][j]==0)p++;
11                if(j==0 || grid[i][j-1]==0)p++;
12                if(j==n-1 || grid[i][j+1]==0)p++;
13                }
14            }
15        }
16        return p;
17    }
18}