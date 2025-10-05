// Last updated: 10/5/2025, 5:28:53 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer[][] dp=new Integer[n][n];
        return helper(nums,0,n-1,dp)>=0;
    }
    public int helper(int[] nums, int i, int j, Integer[][] dp){
        if(i==j)return nums[i];
        if(dp[i][j]!=null) return dp[i][j];
        int l=nums[i]-helper(nums,i+1,j,dp);
        int r=nums[j]-helper(nums,i,j-1,dp);
        return dp[i][j]=Math.max(l,r);
    }
}