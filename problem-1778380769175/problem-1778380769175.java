// Last updated: 5/10/2026, 8:09:29 AM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n=nums.length;
4        int[]ans=new int[2*n];
5
6        for(int i=0;i<n;i++){
7            ans[i]=nums[i];
8        }
9        int idx=n;
10        for(int i=n-1;i>=0;i--){
11            ans[idx++]=nums[i];
12        }
13        return ans;
14    }
15}