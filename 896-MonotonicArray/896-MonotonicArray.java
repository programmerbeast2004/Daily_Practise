// Last updated: 3/31/2026, 10:28:31 AM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean inc=true;
4        boolean dec=true;
5        for(int i=1;i<nums.length;i++){
6            if(nums[i]<nums[i-1])inc=false;
7            if(nums[i]>nums[i-1])dec=false;
8        }
9        return inc || dec;
10    }
11}