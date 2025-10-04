// Last updated: 10/4/2025, 1:57:51 PM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                min=Math.min(min, Math.abs(i-start));
            }
        }
        return min;
    }
}