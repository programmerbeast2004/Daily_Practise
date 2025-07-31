// Last updated: 7/31/2025, 12:18:25 PM
class Solution {
    public int sumBase(int n, int k) {
        int s=0;
        for(int i=n;i>0;i=i/k){
            s=s+i%k;
        }
        return s;
    }
}