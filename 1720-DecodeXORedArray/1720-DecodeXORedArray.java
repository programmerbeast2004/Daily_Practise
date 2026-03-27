// Last updated: 3/27/2026, 8:43:22 AM
1class Solution {
2    public int[] decode(int[] e, int f) {
3        int n=e.length;
4        int[]a=new int[n+1];
5        a[0]=f;
6        for(int i=0;i<n;i++){
7            a[i+1]=e[i]^a[i];
8        }
9        return a;
10    }
11}