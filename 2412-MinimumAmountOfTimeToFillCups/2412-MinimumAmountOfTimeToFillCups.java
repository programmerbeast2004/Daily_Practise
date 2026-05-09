// Last updated: 5/9/2026, 11:26:08 AM
class Solution {
    public int fillCups(int[] a) {
        int s=a[0]+a[1]+a[2];
        int m=Math.max(a[0],Math.max(a[1],a[2]));
        return Math.max(m,(s+1)/2);
    }
}