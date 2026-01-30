// Last updated: 1/30/2026, 2:04:50 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n=nums.length;
4        int c=0;
5        for(int i=0;i<=n-3;i++){
6            if(nums[i]==0){
7                nums[i]^=1;
8                nums[i+1]^=1;
9                nums[i+2]^=1;
10                c++;
11            }
12        }
13        for(int i=n-2;i<n;i++){
14            if(nums[i]==0) return -1;
15        }
16        return c;
17    }
18}