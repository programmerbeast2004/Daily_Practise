// Last updated: 5/9/2026, 11:28:40 AM
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int t=0;
        int m=points.length;
        for(int i=1;i<m;i++){
            int[] p1=points[i-1];
            int[] p2=points[i];
            t+=Math.max(Math.abs(p1[0]-p2[0]),Math.abs(p1[1]-p2[1]));
        }
        return t;
    }
}