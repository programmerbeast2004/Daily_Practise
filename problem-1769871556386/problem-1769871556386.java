// Last updated: 1/31/2026, 8:29:16 PM
1class Solution {
2    public int minimumK(int[] nums) {
3        int l=1,r=100000;
4        while(l<r){
5            int k=(l+r)/2;
6            long ops=0;
7            for(int x:nums) ops+=(x+k-1)/k;
8            if(ops<=(long) k*k) r=k;
9            else l=k+1;
10        }
11        return l;
12    }
13}