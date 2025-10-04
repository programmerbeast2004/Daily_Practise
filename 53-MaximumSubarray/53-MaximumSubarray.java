// Last updated: 10/4/2025, 11:13:53 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE, sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }
        return ans;
        
    }
}