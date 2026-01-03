// Last updated: 1/3/2026, 1:42:33 PM
1class Solution {
2    public boolean canPartition(int[] nums) {
3        int t=0;
4        for(int a:nums){
5            t+=a;
6        }
7        Boolean[][] dp=new Boolean[nums.length][t];
8        if (t % 2 != 0) return false;
9
10        return solve(nums,0, t/2,dp);
11    }
12    public boolean solve(int[] a,int i,int sum,Boolean[][]dp){
13        if(sum==0) return true;
14        if(i==a.length || sum<0) return false;
15        if(dp[i][sum]!=null) return dp[i][sum];
16        boolean p=solve(a,i+1,sum-a[i],dp);
17        boolean np=solve(a,i+1,sum,dp);
18        return dp[i][sum]= p || np;
19    }
20}