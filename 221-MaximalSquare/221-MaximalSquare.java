// Last updated: 1/11/2026, 4:21:25 PM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int[][]dp=new int[m][n];
6        int max=0;
7        for(int i=0;i<m;i++){
8            for(int j=0;j<n;j++){
9                if(matrix[i][j]=='1'){
10                    if(i==0 || j==0){
11                        dp[i][j]=1;
12                    }
13                    else{
14                        dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
15                    }
16                }
17                max=Math.max(max,dp[i][j]);
18            }
19        }
20        return max*max;
21    }
22}