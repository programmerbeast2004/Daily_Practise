// Last updated: 1/6/2026, 11:16:05 AM
1class Solution {
2    public int tribonacci(int n) {
3        int[] dp=new int[n+1];
4        if(n==0) return 0;
5        if(n==1) return 1;
6        dp[0]=0;
7        dp[1]=1;
8        dp[2]=1;
9        for(int i=3;i<=n;i++){
10            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
11        }
12        return dp[n];
13
14    }
15}