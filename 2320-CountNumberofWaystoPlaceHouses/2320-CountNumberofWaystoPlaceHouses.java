// Last updated: 1/16/2026, 11:06:53 PM
1class Solution {
2    public int countHousePlacements(int n) {
3        long MOD=1000000007;
4        long[] dp=new long[n+1];
5        dp[0]=1;
6        dp[1]=2;
7        for(int i=2;i<=n;i++){
8            dp[i]=(dp[i-1]+dp[i-2])%MOD;
9        }
10        long way=dp[n];
11        return (int)((way*way)%MOD);
12    }
13}