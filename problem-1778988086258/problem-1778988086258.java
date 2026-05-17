// Last updated: 5/17/2026, 8:51:26 AM
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        // int le=(int)Math.ceil(Math.pow(l,1.0/k));
4        // int re=(int)Math.floor(Math.pow(r,1.0/k));
5        int le=(int)Math.ceil(Math.pow(l,1.0/k));
6        int re=(int)Math.pow(r,1.0/k);
7
8        while(Math.pow(re+1,k)<=r){
9            re++;
10        }
11        while(Math.pow(re,k)>r){
12            re--;
13        }
14        return Math.max(0,re-le+1);
15    }
16}