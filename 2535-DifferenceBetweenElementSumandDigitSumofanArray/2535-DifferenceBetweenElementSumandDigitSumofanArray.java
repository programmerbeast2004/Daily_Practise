// Last updated: 4/6/2026, 12:43:24 PM
1class Solution {
2    public int differenceOfSum(int[] nums) {
3        int es=0, ds=0;
4        for(int num:nums){
5            es+=num;
6            int temp=num;
7            while(temp>0){
8                ds+=temp%10;
9                temp/=10;
10            }
11        }
12        return Math.abs(ds-es);
13    }
14}