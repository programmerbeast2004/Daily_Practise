// Last updated: 5/9/2026, 12:39:43 PM
1class Solution {
2    public double minimumAverage(int[] nums) {
3        Arrays.sort(nums);
4        int i=0;
5        int j=nums.length-1;
6        double ans=Double.MAX_VALUE;
7        while(i<j){
8            double avg=(nums[i]+nums[j])/2.0;
9            ans=Math.min(ans,avg);
10            i++;
11            j--;
12        }
13        return ans;
14    }
15}