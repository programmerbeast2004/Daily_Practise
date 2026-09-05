// Last updated: 9/5/2026, 5:29:31 PM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        int[]pre=new int[n];
5        int[]suf=new int[n];
6
7        pre[0]=nums[0];
8        for(int i=1;i<n;i++){
9            pre[i]=Math.max(pre[i-1],nums[i]);
10        }
11        suf[n-1]=nums[n-1];
12        for(int i=n-2;i>=0;i--){
13            suf[i]=Math.min(suf[i+1],nums[i]);
14        }
15        for(int i=0;i<n;i++){
16            if((pre[i]-suf[i])<=k){
17                return i;
18            }
19        }
20        return -1;
21    }
22}