// Last updated: 11/29/2025, 10:04:35 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        int n=nums.length;
4        int[] pre=new int[n];
5        pre[0]=nums[0];
6        for(int i=1;i<n;i++){
7            pre[i]=pre[i-1]+nums[i];
8        }
9        return pre;
10    }
11}