// Last updated: 5/9/2026, 11:23:44 AM
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long INF=(long) 1e18;
        long[] cap=new long[n];

        for(int i=0;i<n;i++) cap[i]=INF;
        cap[0]=0;
        for(int[] r:restrictions){
            cap[r[0]]=Math.min(cap[r[0]],r[1]);
        }
        for(int i=1;i<n;i++){
            cap[i]=Math.min(cap[i],cap[i-1]+diff[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            cap[i]=Math.min(cap[i],cap[i+1]+diff[i]);
        }
        long ans=0;
        for(long v:cap) ans= Math.max(ans,v);
        return (int) ans;
    }
}