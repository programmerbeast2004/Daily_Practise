// Last updated: 11/30/2025, 6:20:31 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int n=nums.length;
4        int[] sq=new int[n];
5        for(int i=0;i<n;i++){
6            sq[i]=(int)Math.pow(nums[i],2);
7        }
8        Arrays.sort(sq);
9        return sq;
10    }
11}