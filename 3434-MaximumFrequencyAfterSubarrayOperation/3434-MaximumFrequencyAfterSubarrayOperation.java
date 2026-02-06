// Last updated: 2/6/2026, 2:29:57 PM
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        int count[]=new int[51];
4        int res=0;
5        for(int a:nums){
6            count[a]=Math.max(count[a],count[k])+1;
7            res=Math.max(res,count[a]-count[k]);
8        }
9        return count[k]+res;
10    }
11}