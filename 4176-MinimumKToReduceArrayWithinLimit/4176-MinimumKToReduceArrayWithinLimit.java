// Last updated: 5/9/2026, 11:22:43 AM
class Solution {
    public int minimumK(int[] nums) {
        int l=1,r=100000;
        while(l<r){
            int k=(l+r)/2;
            long ops=0;
            for(int x:nums) ops+=(x+k-1)/k;
            if(ops<=(long) k*k) r=k;
            else l=k+1;
        }
        return l;
    }
}