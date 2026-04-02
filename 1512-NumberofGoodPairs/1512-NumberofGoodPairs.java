// Last updated: 4/2/2026, 12:56:48 PM
1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int[] f=new int[101];
4        int c=0;
5        for(int num:nums){
6            c+=f[num];
7            f[num]++;
8        }
9        return c;
10    }
11}