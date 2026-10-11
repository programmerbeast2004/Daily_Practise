// Last updated: 10/11/2026, 11:33:56 AM
1class Solution {
2    public int sumOfSquares(int[] nums) {
3        int n=nums.length;
4        int s=0;
5        for(int i=0;i<n;i++){
6            if(n%(i+1)==0){
7                s+=Math.pow(nums[i],2);
8            }
9        }
10        return s;
11    }
12}