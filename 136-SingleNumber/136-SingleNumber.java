// Last updated: 7/31/2025, 12:21:18 PM
class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum^=nums[i];
        }
        return sum;
    }
}