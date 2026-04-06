// Last updated: 4/6/2026, 8:43:05 AM
1class Solution {
2    public int maximumScore(int a, int b, int c) {
3        int s=a+b+c;
4        int m=Math.max(a,Math.max(b,c));
5        return Math.min(s/2,s-m);
6    }
7}