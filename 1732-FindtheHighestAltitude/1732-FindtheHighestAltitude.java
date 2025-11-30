// Last updated: 11/30/2025, 6:05:33 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int s=0;
4        int max=0;
5        for(int i:gain){
6            s+=i;
7            max=Math.max(s,max);
8        }
9        return max;
10    }
11}