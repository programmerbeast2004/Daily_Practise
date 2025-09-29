// Last updated: 9/29/2025, 2:56:32 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            if(leftSum==totalSum-leftSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}