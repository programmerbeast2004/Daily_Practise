// Last updated: 10/15/2026, 11:43:02 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        long[] a=new long[nums.length];
4        for(int i=0;i<nums.length;i++){
5            a[i]=(long)nums[i]*nums[i];
6        }
7        
8        Arrays.sort(a);
9
10        long ans=0;
11        int k=nums.length/2;
12
13        for(int i=0;i<k;i++){
14            ans-=a[i];
15        }
16
17        for(int i=k;i<nums.length;i++){
18            ans+=a[i];
19        }
20        return ans;
21    }
22}