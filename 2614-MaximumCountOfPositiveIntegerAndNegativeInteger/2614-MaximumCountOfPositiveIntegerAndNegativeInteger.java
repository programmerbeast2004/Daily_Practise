// Last updated: 7/31/2025, 12:17:37 PM
class Solution {
    public int maximumCount(int[] nums) {
        int posi=0;
        int nega=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) posi++;
            else if(nums[i]<0) nega++; 
        }
        int res=Math.max(posi,nega);
        return res;
    }
}