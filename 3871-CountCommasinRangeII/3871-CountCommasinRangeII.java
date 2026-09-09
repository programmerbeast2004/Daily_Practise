// Last updated: 9/9/2026, 9:41:45 PM
1class Solution {
2    public long countCommas(long n) {
3        if(n<=999) return 0;
4
5        long totalCommas=0;
6        long st=1000;
7        while(st<=n){
8            totalCommas+=n-st+1;
9            st*=1000;
10        }
11        return totalCommas;
12    }
13}