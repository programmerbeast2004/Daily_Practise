// Last updated: 10/1/2025, 1:17:23 PM
class Solution {
    public boolean canJump(int[] nums) {
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(m<i){
                return false;
            }
            m=Math.max(m,nums[i]+i);
        }
        return true;
    }
}