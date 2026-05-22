// Last updated: 5/22/2026, 9:39:23 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        List<Integer>ans=new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==target){
7                ans.add(i);
8            }
9        }
10        return ans;
11    }
12}