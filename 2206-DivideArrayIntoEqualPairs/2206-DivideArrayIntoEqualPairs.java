// Last updated: 5/9/2026, 11:44:21 AM
1class Solution {
2    public boolean divideArray(int[] nums) {
3        int[]freq=new int[501];
4        for(int x:nums){
5            freq[x]++;
6        }
7        for(int x:freq){
8            if(x%2!=0){
9                return false;
10            }
11        }
12        return true;
13    }
14}