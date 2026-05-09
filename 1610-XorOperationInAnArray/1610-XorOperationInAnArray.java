// Last updated: 5/9/2026, 11:28:07 AM
class Solution {
    public int xorOperation(int n, int start) {
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=start+2*i;
        }
        int xor=0;
        for(int num:a){
            xor^=num;
        }
        return xor;
    }
}