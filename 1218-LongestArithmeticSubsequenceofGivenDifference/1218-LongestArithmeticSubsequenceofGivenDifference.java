// Last updated: 1/10/2026, 8:38:25 PM
1class Solution {
2    public int longestSubsequence(int[] arr, int diff) {
3        HashMap<Integer,Integer> map=new HashMap<>();
4        int ans=0;
5        for(int x:arr){
6            int prev=x-diff;
7            int currl=map.getOrDefault(prev,0)+1;
8            map.put(x,currl);
9            ans=Math.max(ans,currl);
10        }
11        return ans;
12
13    }
14}