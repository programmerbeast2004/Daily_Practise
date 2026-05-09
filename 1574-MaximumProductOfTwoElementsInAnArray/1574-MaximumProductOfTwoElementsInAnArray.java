// Last updated: 5/9/2026, 11:28:10 AM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return ((nums[n-1]-1)*(nums[n-2]-1));
    }
}