// Last updated: 10/15/2026, 5:01:21 PM
1class Solution {
2    public boolean findSubarrays(int[] nums) {
3        HashSet<Integer> set=new HashSet<>();
4        for(int i=0;i<nums.length-1;i++){
5            int sum=nums[i]+nums[i+1];
6            if(set.contains(sum)){
7                return true;
8            }
9            set.add(sum);
10        }
11        return false;
12    }
13}