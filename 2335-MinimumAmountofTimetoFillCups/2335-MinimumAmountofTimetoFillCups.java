// Last updated: 4/6/2026, 8:33:59 AM
1class Solution {
2    public int fillCups(int[] a) {
3        int s=a[0]+a[1]+a[2];
4        int m=Math.max(a[0],Math.max(a[1],a[2]));
5        return Math.max(m,(s+1)/2);
6    }
7}