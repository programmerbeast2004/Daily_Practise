// Last updated: 11/30/2025, 6:40:06 AM
1class Solution {
2    public int[] leftRightDifference(int[] nums) {
3        int s=0,s2=0;
4        int[] res=new int[nums.length];
5        for(int i:nums){
6            s+=i;
7        }
8        for(int i=0;i<nums.length;i++){
9            int r=s-nums[i]-s2;
10            int l=s2;
11            res[i]=Math.abs(r-l);
12            s2+=nums[i];
13        }
14        return res;
15    }
16}