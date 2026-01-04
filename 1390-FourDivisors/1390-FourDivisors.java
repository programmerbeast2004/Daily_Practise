// Last updated: 1/4/2026, 12:32:47 PM
1class Solution {
2    public int numOfWays(int n) {
3        final int MOD=1000000007;
4        long x=6,y=6;
5        for(int i=2;i<=n;i++){
6            long newx=(3*x+2*y)%MOD;
7            long newy=(2*x+2*y)%MOD;
8            x=newx;
9            y=newy;
10
11        }
12        return (int)(x+y)%MOD;
13    }
14}