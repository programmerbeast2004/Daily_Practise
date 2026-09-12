// Last updated: 9/12/2026, 9:57:55 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int m=0;
4        for(int i=0;i<nums.length;i++){
5            if(m<i){
6                return false;
7            }
8            m=Math.max(m,nums[i]+i);
9        }
10        return true;
11    }
12}