// Last updated: 7/31/2025, 12:16:36 PM
class Solution {
    public int countSubarrays(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-2;i++){
            if((nums[i]+nums[i+2])*2==nums[i+1]){
                c++;
            }
        }
        return c;
    }
}