// Last updated: 5/9/2026, 11:22:34 AM
class Solution {
    public int countMonobit(int n) {
        int c=1;
        if(n>=1)c++;
        long v=3;
        while(v<=n){
            c++;
            v=(v<<1) | 1;
        }
        return c;
    }
}