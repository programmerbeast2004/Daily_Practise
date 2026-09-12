// Last updated: 9/12/2026, 7:06:42 AM
1class Solution {
2    public boolean canReach(String s, int minJump, int maxJump) {
3        int n=s.length();
4        boolean[]dp=new boolean[n];
5        dp[0]=true;
6
7        int reach=0;
8
9        for(int i=1;i<n;i++){
10            if(i-minJump>=0 && dp[i-minJump]){
11                reach++;
12            }
13            if(i-maxJump-1>=0 && dp[i-maxJump-1]){
14                reach--;
15            }
16            dp[i]=(reach>0 && s.charAt(i)=='0');
17        }
18        return dp[n-1];
19    }
20}