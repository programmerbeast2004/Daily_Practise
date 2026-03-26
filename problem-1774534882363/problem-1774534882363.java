// Last updated: 3/26/2026, 7:51:22 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n=nums.length;
4        int[]freq=new int[n+1];
5        for(int num:nums){
6            freq[num]++;
7        }
8        int d=-1,m=-1;
9        for(int i=1;i<=n;i++){
10            if(freq[i]==2)d=i;
11            if(freq[i]==0)m=i;
12        }
13        return new int[]{d,m};
14    }
15}