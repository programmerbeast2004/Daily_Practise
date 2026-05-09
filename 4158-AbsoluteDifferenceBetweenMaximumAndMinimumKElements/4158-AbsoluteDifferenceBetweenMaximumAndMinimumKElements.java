// Last updated: 5/9/2026, 11:22:46 AM
class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=0, max=0;
        for(int i=0;i<k;i++){
            min+=nums[i];
            max+=nums[nums.length-1-i];
        }
        return Math.abs(max-min);
    }
}