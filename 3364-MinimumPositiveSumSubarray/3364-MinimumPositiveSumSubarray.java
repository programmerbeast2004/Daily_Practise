// Last updated: 10/15/2026, 5:40:03 PM
1class Solution {
2    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
3        int n=nums.size();
4        int ans=Integer.MAX_VALUE;
5
6        for(int i=0;i<n;i++){
7            int sum=0;
8            for(int j=i;j<n;j++){
9                sum+=nums.get(j);
10
11                int len=j-i+1;
12
13                if(len>=l && len<=r && sum>0 ){
14                    ans=Math.min(ans,sum);
15                }
16            }
17        }
18        return ans==Integer.MAX_VALUE ? -1: ans;
19    }
20}