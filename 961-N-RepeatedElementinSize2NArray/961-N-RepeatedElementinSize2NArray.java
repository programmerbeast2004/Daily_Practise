// Last updated: 1/3/2026, 12:56:44 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        if(nums[0]==nums[1] || nums[0]==nums[2] || nums[0]==nums[3]) return nums[0];
4        if(nums[1]==nums[2] || nums[1]==nums[3]) return nums[1];
5        if(nums[2]==nums[3]) return nums[2];
6
7        for(int i=4;i<nums.length+1;i++){
8            if(nums[i]==nums[i+1]){
9                return nums[i];
10            }
11        }
12        return -1;
13    }
14}