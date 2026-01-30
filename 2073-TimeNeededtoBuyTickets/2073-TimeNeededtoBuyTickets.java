// Last updated: 1/30/2026, 1:16:33 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int n=tickets.length;
4        int ans=0;
5        for(int i=0;i<n;i++){
6            if(i<=k){
7                ans+=Math.min(tickets[i],tickets[k]);
8            }
9            else{
10                ans+=Math.min(tickets[i],tickets[k]-1);
11            }
12        }
13        return ans;
14    }
15}