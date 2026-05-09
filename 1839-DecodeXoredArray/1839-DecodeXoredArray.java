// Last updated: 5/9/2026, 11:27:37 AM
class Solution {
    public int[] decode(int[] e, int f) {
        int n=e.length;
        int[]a=new int[n+1];
        a[0]=f;
        for(int i=0;i<n;i++){
            a[i+1]=e[i]^a[i];
        }
        return a;
    }
}