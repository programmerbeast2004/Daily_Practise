// Last updated: 10/7/2025, 7:39:30 AM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n=nums.length;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;

        for(int num:nums){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        long ans=helper(nums,cost,low);
        while(low<high){
            int mid=low+(high-low)/2;
            long cost1=helper(nums,cost,mid);
            long cost2=helper(nums,cost,mid+1);
            ans=Math.min(cost1,cost2);
            if(cost1>cost2) low=mid+1;
            else high=mid;
        }
        return ans;
    }
    private long helper(int[] nums, int[] cost,int target){
        long total=0;
        for(int i=0;i<nums.length;i++){
            total+=(long)Math.abs(nums[i]-target)*cost[i];
        }
        return total;
    }
}