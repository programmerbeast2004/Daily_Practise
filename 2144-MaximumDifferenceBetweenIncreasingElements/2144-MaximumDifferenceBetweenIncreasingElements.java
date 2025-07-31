// Last updated: 7/31/2025, 12:18:14 PM
class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]<nums[j]){
                    max=Math.max(max,nums[j]-nums[i]);
                }
                
            }
        }
        return max;
    }
}