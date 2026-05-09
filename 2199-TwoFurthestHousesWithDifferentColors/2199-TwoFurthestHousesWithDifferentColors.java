// Last updated: 5/9/2026, 11:26:48 AM
class Solution {
    public int maxDistance(int[] color) {
        int n=color.length;
        int l=0;
        int r=n-1;
        while(color[r]==color[0]){
            r--;
        }
        while(color[l]==color[n-1]){
            l++;
        }
        return Math.max(r,n-l-1);
    }
}