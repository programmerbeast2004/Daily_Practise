// Last updated: 7/31/2025, 12:19:54 PM
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minX=m;
        int minY=n;
        for(int[] v:ops){
            minX=Math.min(minX,v[0]);
            minY=Math.min(minY,v[1]);
        }
        return minX*minY;
    }
}