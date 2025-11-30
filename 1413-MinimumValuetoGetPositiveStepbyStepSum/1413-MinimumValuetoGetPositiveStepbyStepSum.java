// Last updated: 11/30/2025, 5:49:42 AM
1class Solution {
2    public int minStartValue(int[] nums) {
3        int min=0;
4        int s=0;
5        for(int num:nums){
6            s+=num;
7        if(s<min){
8            min=s;
9        }
10        }
11        return 1-min;
12    }
13}