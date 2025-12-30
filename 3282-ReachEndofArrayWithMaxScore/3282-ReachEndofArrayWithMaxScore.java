// Last updated: 12/30/2025, 11:47:30 PM
1class Solution {
2    public long findMaximumScore(List<Integer> nums) {
3        long res=0, m=0;
4        for(int n:nums){
5            res+=m;
6            m=Math.max(m,n);
7        }
8        return res;
9
10    }
11}