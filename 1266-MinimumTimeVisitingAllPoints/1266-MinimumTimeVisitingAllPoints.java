// Last updated: 1/13/2026, 6:45:44 AM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int t=0;
4        int m=points.length;
5        for(int i=1;i<m;i++){
6            int[] p1=points[i-1];
7            int[] p2=points[i];
8            t+=Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]));
9        }
10        return t;
11    }
12}