// Last updated: 5/9/2026, 11:22:32 AM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int i=n-1;
        while(i>0 && nums[i]> nums[i-1]){
            i--;
        }
        return i;
    }
}