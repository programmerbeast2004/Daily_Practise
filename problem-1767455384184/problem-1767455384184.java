// Last updated: 1/3/2026, 9:19:44 PM
1class Solution {
2    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
3        long INF=(long) 1e18;
4        long[] cap=new long[n];
5
6        for(int i=0;i<n;i++) cap[i]=INF;
7        cap[0]=0;
8        for(int[] r:restrictions){
9            cap[r[0]]=Math.min(cap[r[0]],r[1]);
10        }
11        for(int i=1;i<n;i++){
12            cap[i]=Math.min(cap[i],cap[i-1]+diff[i-1]);
13        }
14        for(int i=n-2;i>=0;i--){
15            cap[i]=Math.min(cap[i],cap[i+1]+diff[i]);
16        }
17        long ans=0;
18        for(long v:cap) ans= Math.max(ans,v);
19        return (int) ans;
20    }
21}