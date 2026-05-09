// Last updated: 5/9/2026, 11:23:18 AM
class Solution {
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
        /*int[]dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            dp[i]=dp[i-1];
            if(colors[i]!=colors[i-1]){
                dp[i]=Math.max(dp[i],dp[i-1]+nums[i]);
            }
            else if(i>1){
                dp[i]=Math.max(dp[i],dp[i-2]+nums[i]);
            }
            else{
                dp[i]=Math.max(dp[i],nums[i]);
            }
        }
        return dp[n-1];
        */
        long[] t=new long[n];
        long[]s=new long[n];
        t[0]=nums[0];
        s[0]=0;
        for(int i=1;i<n;i++){
            s[i]=Math.max(t[i-1],s[i-1]);
            if(colors[i]!=colors[i-1]){
                t[i]=Math.max(t[i-1],s[i-1])+nums[i];
            }
            else{
                t[i]=s[i-1]+nums[i];
            }
        }
        return Math.max(t[n-1],s[n-1]);
    }
}