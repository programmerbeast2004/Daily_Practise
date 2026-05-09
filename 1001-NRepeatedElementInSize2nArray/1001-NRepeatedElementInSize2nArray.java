// Last updated: 5/9/2026, 11:29:29 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        if(nums[0]==nums[1] || nums[0]==nums[2] || nums[0]==nums[3]) return nums[0];
        if(nums[1]==nums[2] || nums[1]==nums[3]) return nums[1];
        if(nums[2]==nums[3]) return nums[2];

        for(int i=4;i<nums.length+1;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}