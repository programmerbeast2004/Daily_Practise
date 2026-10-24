// Last updated: 10/24/2026, 11:44:27 AM
1class Solution {
2    public int longestAlternatingSubarray(int[] nums, int threshold) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]%2==0 && nums[i]<=threshold){
6                int j=i;
7
8                while(j<nums.length && nums[j]<=threshold && (j==i || nums[j]%2!=nums[j-1]%2)){
9                    j++;
10                }
11                ans=Math.max(ans,j-i);
12            }
13        }
14        return ans;
15    }
16}