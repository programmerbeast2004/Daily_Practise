// Last updated: 2/14/2026, 9:10:16 PM
1class Solution {
2    public long rob(int[] nums, int[] colors) {
3        int n=nums.length;
4        if(n==0) return 0;
5        if(n==1) return nums[0];
6        /*int[]dp=new int[n];
7        dp[0]=nums[0];
8        for(int i=1;i<n;i++){
9            dp[i]=dp[i-1];
10            if(colors[i]!=colors[i-1]){
11                dp[i]=Math.max(dp[i],dp[i-1]+nums[i]);
12            }
13            else if(i>1){
14                dp[i]=Math.max(dp[i],dp[i-2]+nums[i]);
15            }
16            else{
17                dp[i]=Math.max(dp[i],nums[i]);
18            }
19        }
20        return dp[n-1];
21        */
22        long[] t=new long[n];
23        long[]s=new long[n];
24        t[0]=nums[0];
25        s[0]=0;
26        for(int i=1;i<n;i++){
27            s[i]=Math.max(t[i-1],s[i-1]);
28            if(colors[i]!=colors[i-1]){
29                t[i]=Math.max(t[i-1],s[i-1])+nums[i];
30            }
31            else{
32                t[i]=s[i-1]+nums[i];
33            }
34        }
35        return Math.max(t[n-1],s[n-1]);
36    }
37}