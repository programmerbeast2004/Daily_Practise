// Last updated: 1/16/2026, 11:36:38 PM
1class Solution {
2    public int minElements(int[] nums, int limit, int goal) {
3        long sum=0;
4        for(int x:nums){
5            sum+=x;
6        }
7        long diff=Math.abs(goal-sum);
8        long res=(diff+limit-1)/limit;
9        return (int)res;
10    }
11}