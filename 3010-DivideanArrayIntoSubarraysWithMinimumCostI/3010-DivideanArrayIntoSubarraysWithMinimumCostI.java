// Last updated: 2/1/2026, 10:28:21 PM
1class Solution {
2    public int minimumCost(int[] nums) {
3        Arrays.sort(nums,1,nums.length);
4        return nums[0]+nums[1]+nums[2];
5    }
6}