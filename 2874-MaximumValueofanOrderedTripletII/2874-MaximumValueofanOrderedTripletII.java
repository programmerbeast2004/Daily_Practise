// Last updated: 2/6/2026, 1:14:47 PM
1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        long ans=0;
4        long maxDiff=0;
5        long maxNum=0;
6        for(final long num:nums){
7            ans=Math.max(ans,maxDiff*num);
8            maxDiff=Math.max(maxDiff,maxNum-num);
9            maxNum=Math.max(maxNum,num);
10        }
11        return ans;
12    }
13}