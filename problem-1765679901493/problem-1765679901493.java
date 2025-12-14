// Last updated: 12/14/2025, 8:08:21 AM
1class Solution {
2    public int absDifference(int[] nums, int k) {
3        Arrays.sort(nums);
4        int min=0, max=0;
5        for(int i=0;i<k;i++){
6            min+=nums[i];
7            max+=nums[nums.length-1-i];
8        }
9        return Math.abs(max-min);
10    }
11}