// Last updated: 5/9/2026, 11:31:41 AM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median=nums[nums.length/2];
        int c=0;
        for(int x:nums){
            c+=Math.abs(x-median);
        }
        return c;
    }
}