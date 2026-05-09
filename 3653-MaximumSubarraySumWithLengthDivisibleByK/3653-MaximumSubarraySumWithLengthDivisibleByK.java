// Last updated: 5/9/2026, 11:23:59 AM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long[] pre=new long[n+1];
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+nums[i];
        }
        long[] minpre=new long[n];
        for(int i=0;i<k;i++){
            minpre[i]=Long.MAX_VALUE;
        }
        long sum=Long.MIN_VALUE;
        for(int i=0;i<=n;i++){
            int rem=i%k;
            if(i>=k){
                sum=Math.max(sum,pre[i]-minpre[rem]);
            }
            minpre[rem]=Math.min(minpre[rem],pre[i]);
        }
        return sum==Long.MIN_VALUE ? 0:sum;
    }
}