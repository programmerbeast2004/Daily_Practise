// Last updated: 5/9/2026, 11:24:49 AM
class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans=0;
        long maxDiff=0;
        long maxNum=0;
        for(final long num:nums){
            ans=Math.max(ans,maxDiff*num);
            maxDiff=Math.max(maxDiff,maxNum-num);
            maxNum=Math.max(maxNum,num);
        }
        return ans;
    }
}