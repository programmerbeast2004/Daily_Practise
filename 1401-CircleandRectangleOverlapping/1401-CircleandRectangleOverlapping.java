// Last updated: 9/22/2026, 11:20:32 AM
1class Solution {
2    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
3        int x=Math.max(x1,Math.min(xc,x2))-xc;
4        int y=Math.max(y1,Math.min(yc,y2))-yc;
5
6        return x*x+y*y<=r*r;
7
8    }
9}