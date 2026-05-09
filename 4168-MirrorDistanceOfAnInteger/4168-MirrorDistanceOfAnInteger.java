// Last updated: 5/9/2026, 11:22:45 AM
class Solution {
    public int mirrorDistance(int n) {
        int t=n;
        int r=0;
        while(n>0){
            r=r*10+(n%10);
            n/=10;
        }
        return Math.abs(t-r);
    }
}