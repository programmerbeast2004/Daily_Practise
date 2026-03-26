// Last updated: 3/26/2026, 7:03:48 PM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        int min=Integer.MAX_VALUE;
4        Arrays.sort(nums);
5        int n=nums.length;
6        for(int i=0;i<=n-k;i++){
7            int dif=nums[i+k-1]-nums[i];
8            min=Math.min(min,dif);
9        }
10        return min;
11    }
12}