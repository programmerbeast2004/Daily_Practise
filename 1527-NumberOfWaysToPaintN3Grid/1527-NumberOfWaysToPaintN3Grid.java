// Last updated: 5/9/2026, 11:28:17 AM
class Solution {
    public int numOfWays(int n) {
        final int MOD=1000000007;
        long x=6,y=6;
        for(int i=2;i<=n;i++){
            long newx=(3*x+2*y)%MOD;
            long newy=(2*x+2*y)%MOD;
            x=newx;
            y=newy;

        }
        return (int)(x+y)%MOD;
    }
}