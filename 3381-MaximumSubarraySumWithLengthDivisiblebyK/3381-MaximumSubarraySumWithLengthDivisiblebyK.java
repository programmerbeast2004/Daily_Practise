// Last updated: 11/27/2025, 6:43:35 AM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        int n=nums.length;
4        long[] pre=new long[n+1];
5        for(int i=0;i<n;i++){
6            pre[i+1]=pre[i]+nums[i];
7        }
8        long[] minpre=new long[n];
9        for(int i=0;i<k;i++){
10            minpre[i]=Long.MAX_VALUE;
11        }
12        long sum=Long.MIN_VALUE;
13        for(int i=0;i<=n;i++){
14            int rem=i%k;
15            if(i>=k){
16                sum=Math.max(sum,pre[i]-minpre[rem]);
17            }
18            minpre[rem]=Math.min(minpre[rem],pre[i]);
19        }
20        return sum==Long.MIN_VALUE ? 0:sum;
21    }
22}