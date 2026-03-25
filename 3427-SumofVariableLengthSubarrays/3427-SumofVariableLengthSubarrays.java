// Last updated: 3/26/2026, 2:47:31 AM
1class Solution {
2    public int subarraySum(int[] nums) {
3        int n=nums.length;
4        int s=0;
5        for(int i=0;i<nums.length;i++){
6            int st=Math.max(0,i-nums[i]);
7            for(int j=st;j<=i;j++){
8                s+=nums[j];
9            }
10        }
11        return s;
12    }
13}