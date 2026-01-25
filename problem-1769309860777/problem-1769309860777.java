// Last updated: 1/25/2026, 8:27:40 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n=nums.length;
4        int i=n-1;
5        while(i>0 && nums[i]> nums[i-1]){
6            i--;
7        }
8        return i;
9    }
10}