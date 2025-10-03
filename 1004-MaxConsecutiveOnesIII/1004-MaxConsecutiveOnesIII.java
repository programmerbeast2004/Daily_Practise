// Last updated: 10/3/2025, 6:32:51 AM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0,s=0;
        int minWindow=Integer.MAX_VALUE;
        while(r<nums.length){
            s+=nums[r];
            r++;
            while(s>=target){
                int curr=r-l;
                minWindow=Math.min(minWindow,curr);
                s-=nums[l];
                l++;
            }
        }
        return  minWindow==Integer.MAX_VALUE? 0: minWindow;
    }
}