// Last updated: 1/12/2026, 6:57:22 AM
1class Solution {
2    public int countSquares(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[][]dp=new int[m][n];
6        int c=0;
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(matrix[i][j]==1){
10                    if(i==0 || j==0){
11                        dp[i][j]=1;
12                        c+=dp[i][j];
13                    }
14                    else{
15                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
16                        c+=dp[i][j];
17                    }
18                }
19            }
20        }
21        return c;
22    }
23}