// Last updated: 1/11/2026, 8:35:03 AM
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        int n=nums.length;
4        int c=0;
5        for(int i=0;i<n;i++){
6            int s=0;
7            for(int j=i;j<n;j++){
8                s+=nums[j];
9                for(int k=i;k<=j;k++){
10                    if(nums[k]==s){
11                        c++;
12                        break;
13                    }
14                }
15            }
16        }
17        return c;
18    }
19}