// Last updated: 9/29/2025, 1:10:25 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double ans=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans=sum;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            ans=Math.max(ans,sum);
        }
        return ans/k;
    }
}