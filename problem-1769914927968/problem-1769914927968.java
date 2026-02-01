// Last updated: 2/1/2026, 8:32:07 AM
1class Solution {
2    public int countMonobit(int n) {
3        int c=1;
4        if(n>=1)c++;
5        long v=3;
6        while(v<=n){
7            c++;
8            v=(v<<1) | 1;
9        }
10        return c;
11    }
12}