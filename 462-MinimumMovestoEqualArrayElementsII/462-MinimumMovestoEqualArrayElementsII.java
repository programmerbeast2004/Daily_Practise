// Last updated: 11/22/2025, 7:38:39 PM
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