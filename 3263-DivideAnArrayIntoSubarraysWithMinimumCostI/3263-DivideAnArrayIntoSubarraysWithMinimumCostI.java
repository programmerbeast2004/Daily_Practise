// Last updated: 5/9/2026, 11:24:37 AM
class Solution {
    public int minimumCost(int[] nums) {
        Arrays.sort(nums,1,nums.length);
        return nums[0]+nums[1]+nums[2];
    }
}