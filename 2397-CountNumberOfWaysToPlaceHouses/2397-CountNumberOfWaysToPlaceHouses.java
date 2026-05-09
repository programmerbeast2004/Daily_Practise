// Last updated: 5/9/2026, 11:26:10 AM
class Solution {
    public int countHousePlacements(int n) {
        long MOD=1000000007;
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
        }
        long way=dp[n];
        return (int)((way*way)%MOD);
    }
}