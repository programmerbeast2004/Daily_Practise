// Last updated: 5/9/2026, 11:26:19 AM
class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=nums[0];
        for(int x:nums){
            if(Math.abs(x)<Math.abs(ans) || Math.abs(x)==Math.abs(ans) && x>ans){
                ans=x;
            }
        }
        return ans;
    }
}