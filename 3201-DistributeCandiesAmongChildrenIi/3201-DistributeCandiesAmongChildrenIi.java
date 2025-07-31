// Last updated: 7/31/2025, 12:17:02 PM
class Solution {
    public long distributeCandies(int n, int limit) {
        long c=0;
        for(int i=0;i<=Math.min(limit,n);i++){
            if(n-i<=2*limit){
                c+=Math.min(n-i,limit)-Math.max(0,n-i-limit)+1;
            }

        }
        return c;
    }
}