// Last updated: 1/1/2026, 12:27:21 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int n=nums.length;
4        int[] ans=new int[n];
5        int p=0;
6        for(int i=0;i<n;i++){
7            if((nums[i]%2)==0){
8                ans[p]=nums[i];
9                p++;
10            }
11        }
12        for(int i=0;i<n;i++){
13            if((nums[i]%2)!=0){
14                ans[p]=nums[i];
15                p++;
16            }
17        }
18        return ans;
19    }
20}